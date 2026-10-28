.class public final synthetic Lpp2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lpp2/c;->w:I

    iput-object p1, p0, Lpp2/c;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lpp2/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpp2/c;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/r0;

    invoke-static {v0}, Lpp2/p;->b(Landroidx/fragment/app/r0;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lpp2/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d$a;

    invoke-static {v0}, Lpp2/p;->a(Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d$a;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lpp2/c;->x:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    invoke-static {v0}, Lpp2/e;->a(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
