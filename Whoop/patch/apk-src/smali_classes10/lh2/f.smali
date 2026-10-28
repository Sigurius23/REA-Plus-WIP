.class public final synthetic Llh2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroidx/fragment/app/m0;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/m0;I)V
    .locals 0

    iput p2, p0, Llh2/f;->w:I

    iput-object p1, p0, Llh2/f;->x:Landroidx/fragment/app/m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Llh2/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llh2/f;->x:Landroidx/fragment/app/m0;

    invoke-static {v0}, Ltq1/b;->a(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Llh2/f;->x:Landroidx/fragment/app/m0;

    invoke-static {v0}, Ln12/a;->b(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Llh2/f;->x:Landroidx/fragment/app/m0;

    invoke-static {v0}, Ln12/a;->a(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Llh2/f;->x:Landroidx/fragment/app/m0;

    invoke-static {v0}, Lcom/whoop/stories/c;->b(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
