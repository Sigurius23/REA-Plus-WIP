.class public final synthetic Lmp0/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lmp0/v;

.field public final synthetic y:Lgf2/g;


# direct methods
.method public synthetic constructor <init>(Lmp0/v;Lgf2/g;I)V
    .locals 0

    iput p3, p0, Lmp0/u;->w:I

    iput-object p1, p0, Lmp0/u;->x:Lmp0/v;

    iput-object p2, p0, Lmp0/u;->y:Lgf2/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lmp0/u;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmp0/u;->y:Lgf2/g;

    check-cast p1, Landroid/view/View;

    iget-object v1, p0, Lmp0/u;->x:Lmp0/v;

    invoke-static {v1, v0, p1}, Lmp0/v;->I(Lmp0/v;Lgf2/g;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lmp0/u;->y:Lgf2/g;

    check-cast p1, Landroid/view/View;

    iget-object v1, p0, Lmp0/u;->x:Lmp0/v;

    invoke-static {v1, v0, p1}, Lmp0/v;->H(Lmp0/v;Lgf2/g;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
