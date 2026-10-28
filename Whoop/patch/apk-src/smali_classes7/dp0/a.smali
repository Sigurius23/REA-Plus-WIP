.class public final synthetic Ldp0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ldp0/g;


# direct methods
.method public synthetic constructor <init>(Ldp0/g;I)V
    .locals 0

    iput p2, p0, Ldp0/a;->w:I

    iput-object p1, p0, Ldp0/a;->x:Ldp0/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ldp0/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ldp0/a;->x:Ldp0/g;

    check-cast p1, Lp1/i0;

    invoke-static {v0, p1}, Ldp0/c;->d(Ldp0/g;Lp1/i0;)Lp1/h0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ldp0/a;->x:Ldp0/g;

    check-cast p1, Lp1/i0;

    invoke-static {v0, p1}, Ldp0/c;->b(Ldp0/g;Lp1/i0;)Lp1/h0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
