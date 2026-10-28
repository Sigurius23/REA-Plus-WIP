.class public final synthetic Leu2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Leu2/f;->w:I

    iput-object p1, p0, Leu2/f;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Leu2/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Leu2/f;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Leu2/g;->c(Lkotlin/jvm/functions/Function1;II)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Leu2/f;->x:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    check-cast p1, Lj31/d;

    check-cast p2, Lj31/d;

    invoke-static {v0, p1, p2}, Leu2/g;->k(Lp1/c1;Lj31/d;Lj31/d;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
