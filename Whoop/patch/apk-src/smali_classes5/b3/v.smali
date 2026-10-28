.class public final Lb3/v;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lg2/d;


# direct methods
.method public synthetic constructor <init>(Lg2/d;I)V
    .locals 0

    iput p2, p0, Lb3/v;->w:I

    iput-object p1, p0, Lb3/v;->x:Lg2/d;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lb3/v;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lg2/x;

    iget-object v0, p0, Lb3/v;->x:Lg2/d;

    iget v0, v0, Lg2/d;->a:I

    invoke-virtual {p1, v0}, Lg2/x;->b1(I)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lg2/x;

    iget-object v0, p0, Lb3/v;->x:Lg2/d;

    iget v0, v0, Lg2/d;->a:I

    invoke-virtual {p1, v0}, Lg2/x;->b1(I)Z

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
