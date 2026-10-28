.class public final synthetic Lrs1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/labrador/LabradorResultsFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/labrador/LabradorResultsFragment;I)V
    .locals 0

    iput p2, p0, Lrs1/c;->w:I

    iput-object p1, p0, Lrs1/c;->x:Lcom/whoop/labrador/LabradorResultsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lrs1/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lrs1/c;->x:Lcom/whoop/labrador/LabradorResultsFragment;

    check-cast p1, Lyt1/a;

    invoke-static {v0, p1}, Lcom/whoop/labrador/LabradorResultsFragment;->B(Lcom/whoop/labrador/LabradorResultsFragment;Lyt1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lrs1/c;->x:Lcom/whoop/labrador/LabradorResultsFragment;

    check-cast p1, Lzt1/d;

    invoke-static {v0, p1}, Lcom/whoop/labrador/LabradorResultsFragment;->y(Lcom/whoop/labrador/LabradorResultsFragment;Lzt1/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
