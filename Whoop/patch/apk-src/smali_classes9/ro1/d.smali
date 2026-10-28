.class public final synthetic Lro1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lso1/b0;


# direct methods
.method public synthetic constructor <init>(Lso1/b0;I)V
    .locals 0

    iput p2, p0, Lro1/d;->w:I

    iput-object p1, p0, Lro1/d;->x:Lso1/b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lro1/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lro1/d;->x:Lso1/b0;

    check-cast p1, Lso1/a0;

    invoke-static {v0, p1}, Lro1/f;->i(Lso1/b0;Lso1/a0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lro1/d;->x:Lso1/b0;

    check-cast p1, Lso1/a0;

    invoke-static {v0, p1}, Lro1/f;->b(Lso1/b0;Lso1/a0;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
