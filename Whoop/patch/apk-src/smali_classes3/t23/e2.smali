.class public final Lt23/e2;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lt23/g2;


# direct methods
.method public synthetic constructor <init>(Lt23/g2;I)V
    .locals 0

    iput p2, p0, Lt23/e2;->w:I

    iput-object p1, p0, Lt23/e2;->x:Lt23/g2;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lt23/e2;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lc43/w;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    new-instance v0, Lt23/c2;

    iget-object v1, p0, Lt23/e2;->x:Lt23/g2;

    iget-object v1, v1, Lt23/g2;->a:Ljava/lang/String;

    invoke-direct {v0, v1, p1, p2}, Lt23/c2;-><init>(Ljava/lang/String;Lc43/w;Z)V

    return-object v0

    :pswitch_0
    check-cast p1, Lc43/a;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    new-instance v0, Lt23/b2;

    iget-object v1, p0, Lt23/e2;->x:Lt23/g2;

    iget-object v1, v1, Lt23/g2;->a:Ljava/lang/String;

    invoke-direct {v0, v1, p1, p2}, Lt23/b2;-><init>(Ljava/lang/String;Lc43/a;Z)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
