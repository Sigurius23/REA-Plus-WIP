.class public final synthetic Llf0/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lny0/p0;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lny0/p0;I)V
    .locals 0

    .line 1
    iput p3, p0, Llf0/s0;->w:I

    iput-object p1, p0, Llf0/s0;->y:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Llf0/s0;->x:Lny0/p0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lny0/p0;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    iput p3, p0, Llf0/s0;->w:I

    iput-object p1, p0, Llf0/s0;->x:Lny0/p0;

    iput-object p2, p0, Llf0/s0;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Llf0/s0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llf0/s0;->x:Lny0/p0;

    iget-object v1, p0, Llf0/s0;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lsz0/g0;->i(Lkotlin/jvm/functions/Function1;Lny0/p0;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Llf0/s0;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Llf0/s0;->x:Lny0/p0;

    invoke-static {v0, v1, p1}, Lsz0/g0;->c(Lkotlin/jvm/functions/Function1;Lny0/p0;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Llf0/s0;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Llf0/s0;->x:Lny0/p0;

    invoke-static {v0, v1, p1}, Lq21/g;->c(Lkotlin/jvm/functions/Function1;Lny0/p0;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Llf0/s0;->x:Lny0/p0;

    iget-object v1, p0, Llf0/s0;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lny0/i0;->b(Lkotlin/jvm/functions/Function1;Lny0/p0;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Llf0/s0;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Llf0/s0;->x:Lny0/p0;

    invoke-static {v0, v1, p1}, Llf0/t0;->d(Lkotlin/jvm/functions/Function1;Lny0/p0;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
