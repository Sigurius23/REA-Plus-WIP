.class public final synthetic Lrs1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/labrador/LabradorResultsFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/labrador/LabradorResultsFragment;I)V
    .locals 0

    iput p2, p0, Lrs1/b;->w:I

    iput-object p1, p0, Lrs1/b;->x:Lcom/whoop/labrador/LabradorResultsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lrs1/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lrs1/b;->x:Lcom/whoop/labrador/LabradorResultsFragment;

    invoke-static {v0}, Lcom/whoop/labrador/LabradorResultsFragment;->A(Lcom/whoop/labrador/LabradorResultsFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lrs1/b;->x:Lcom/whoop/labrador/LabradorResultsFragment;

    invoke-static {v0}, Lcom/whoop/labrador/LabradorResultsFragment;->D(Lcom/whoop/labrador/LabradorResultsFragment;)Lyt1/b;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lrs1/b;->x:Lcom/whoop/labrador/LabradorResultsFragment;

    invoke-static {v0}, Lcom/whoop/labrador/LabradorResultsFragment;->z(Lcom/whoop/labrador/LabradorResultsFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
