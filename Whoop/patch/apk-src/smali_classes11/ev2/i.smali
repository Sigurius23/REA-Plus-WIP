.class public final synthetic Lev2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function3;


# direct methods
.method public synthetic constructor <init>(ILkotlin/jvm/functions/Function3;)V
    .locals 0

    iput p1, p0, Lev2/i;->w:I

    iput-object p2, p0, Lev2/i;->x:Lkotlin/jvm/functions/Function3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lev2/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lev2/i;->x:Lkotlin/jvm/functions/Function3;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lev2/u;->J(Lkotlin/jvm/functions/Function3;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lev2/i;->x:Lkotlin/jvm/functions/Function3;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lev2/n;->n(Lkotlin/jvm/functions/Function3;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
