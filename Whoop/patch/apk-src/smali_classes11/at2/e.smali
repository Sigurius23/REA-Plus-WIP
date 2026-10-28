.class public final synthetic Lat2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Lcom/whoop/weeklyplan/customizeplan/view/CustomizePlanFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/weeklyplan/customizeplan/view/CustomizePlanFragment;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lat2/e;->w:Lcom/whoop/weeklyplan/customizeplan/view/CustomizePlanFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lat2/e;->w:Lcom/whoop/weeklyplan/customizeplan/view/CustomizePlanFragment;

    invoke-static {v0, p1, p2}, Lcom/whoop/weeklyplan/customizeplan/view/CustomizePlanFragment;->y(Lcom/whoop/weeklyplan/customizeplan/view/CustomizePlanFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
