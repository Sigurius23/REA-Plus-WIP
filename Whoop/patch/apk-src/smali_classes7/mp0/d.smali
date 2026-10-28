.class public final synthetic Lmp0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lmp0/e;


# direct methods
.method public synthetic constructor <init>(Lmp0/e;I)V
    .locals 0

    iput p2, p0, Lmp0/d;->w:I

    iput-object p1, p0, Lmp0/d;->x:Lmp0/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lmp0/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmp0/d;->x:Lmp0/e;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lmp0/e;->G(Lmp0/e;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lmp0/d;->x:Lmp0/e;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lmp0/e;->F(Lmp0/e;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
