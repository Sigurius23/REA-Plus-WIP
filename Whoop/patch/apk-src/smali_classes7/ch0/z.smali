.class public final synthetic Lch0/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lch0/s0;Lch0/o0;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lch0/z;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch0/z;->y:Ljava/lang/Object;

    iput-object p2, p0, Lch0/z;->z:Ljava/lang/Object;

    iput-object p3, p0, Lch0/z;->x:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lch0/z;->E:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p5, p0, Lch0/z;->w:I

    iput-object p1, p0, Lch0/z;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lch0/z;->y:Ljava/lang/Object;

    iput-object p3, p0, Lch0/z;->z:Ljava/lang/Object;

    iput-object p4, p0, Lch0/z;->E:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lch0/z;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lch0/z;->y:Ljava/lang/Object;

    check-cast v0, Lch0/s0;

    iget-object v1, p0, Lch0/z;->z:Ljava/lang/Object;

    check-cast v1, Lch0/o0;

    iget-object v2, p0, Lch0/z;->E:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    check-cast p1, Lp1/i0;

    iget-object v3, p0, Lch0/z;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v3, v2, p1}, Lch0/q0;->c(Lch0/s0;Lch0/o0;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lp1/i0;)Lp1/h0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lch0/z;->y:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v1, p0, Lch0/z;->z:Ljava/lang/Object;

    check-cast v1, Lg1/y3;

    iget-object v2, p0, Lch0/z;->E:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    check-cast p1, Lcom/whoop/ai/chat/models/TurnFeedback;

    iget-object v3, p0, Lch0/z;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v3, v0, v1, v2, p1}, Lch0/m0;->s(Lkotlin/jvm/functions/Function1;Lbc3/c0;Lg1/y3;Lp1/c1;Lcom/whoop/ai/chat/models/TurnFeedback;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lch0/z;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lch0/z;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lch0/z;->E:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lch0/z;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v3, v0, v1, v2, p1}, Lch0/c0;->i(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
