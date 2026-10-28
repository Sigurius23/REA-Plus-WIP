.class public final synthetic Lpp1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lnp1/j$g;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lnp1/j$g;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lpp1/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpp1/d;->y:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lpp1/d;->x:Lnp1/j$g;

    iput-object p3, p0, Lpp1/d;->z:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lnp1/j$g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lpp1/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpp1/d;->x:Lnp1/j$g;

    iput-object p2, p0, Lpp1/d;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lpp1/d;->z:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lpp1/d;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lpp1/d;->x:Lnp1/j$g;

    iget-object v1, p0, Lpp1/d;->y:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lpp1/d;->z:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2, p1}, Lpp1/i;->f(Lnp1/j$g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lpp1/d;->z:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Lpp1/d;->y:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lpp1/d;->x:Lnp1/j$g;

    invoke-static {v1, v2, v0, p1}, Lpp1/i;->F(Lkotlin/jvm/functions/Function1;Lnp1/j$g;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
