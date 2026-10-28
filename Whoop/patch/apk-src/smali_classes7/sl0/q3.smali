.class public final synthetic Lsl0/q3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic w:I

.field public final synthetic x:Lsl0/y0;

.field public final synthetic y:Lnl0/f;

.field public final synthetic z:Lh51/f;


# direct methods
.method public synthetic constructor <init>(Lsl0/y0;Lnl0/f;Lh51/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p6, p0, Lsl0/q3;->w:I

    iput-object p1, p0, Lsl0/q3;->x:Lsl0/y0;

    iput-object p2, p0, Lsl0/q3;->y:Lnl0/f;

    iput-object p3, p0, Lsl0/q3;->z:Lh51/f;

    iput-object p4, p0, Lsl0/q3;->E:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lsl0/q3;->F:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lsl0/q3;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v4, p0, Lsl0/q3;->E:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Lsl0/q3;->F:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lsl0/q3;->x:Lsl0/y0;

    iget-object v2, p0, Lsl0/q3;->y:Lnl0/f;

    iget-object v3, p0, Lsl0/q3;->z:Lh51/f;

    move-object v6, p1

    invoke-static/range {v1 .. v6}, Lsl0/s3;->c(Lsl0/y0;Lnl0/f;Lh51/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v5, p1

    iget-object v3, p0, Lsl0/q3;->E:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lsl0/q3;->F:Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lsl0/q3;->x:Lsl0/y0;

    iget-object v1, p0, Lsl0/q3;->y:Lnl0/f;

    iget-object v2, p0, Lsl0/q3;->z:Lh51/f;

    invoke-static/range {v0 .. v5}, Lsl0/r3;->f(Lsl0/y0;Lnl0/f;Lh51/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
