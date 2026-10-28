.class public final synthetic Lpt2/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Lcom/whoop/weeklyplan/hubandspoke/view/HubAndSpokeFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/weeklyplan/hubandspoke/view/HubAndSpokeFragment;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpt2/m;->w:Lcom/whoop/weeklyplan/hubandspoke/view/HubAndSpokeFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lpt2/m;->w:Lcom/whoop/weeklyplan/hubandspoke/view/HubAndSpokeFragment;

    invoke-static {v0, p1, p2}, Lcom/whoop/weeklyplan/hubandspoke/view/HubAndSpokeFragment;->D(Lcom/whoop/weeklyplan/hubandspoke/view/HubAndSpokeFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
