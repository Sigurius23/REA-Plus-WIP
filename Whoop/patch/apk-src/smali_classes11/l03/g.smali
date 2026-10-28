.class public final synthetic Ll03/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;

.field public final synthetic y:Landroid/content/Context;

.field public final synthetic z:Ll03/h;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Ll03/h;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Ll03/g;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll03/g;->y:Landroid/content/Context;

    iput-object p2, p0, Ll03/g;->x:Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;

    iput-object p3, p0, Ll03/g;->z:Ll03/h;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Landroid/content/Context;Ll03/h;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Ll03/g;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll03/g;->x:Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;

    iput-object p2, p0, Ll03/g;->y:Landroid/content/Context;

    iput-object p3, p0, Ll03/g;->z:Ll03/h;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Ll03/g;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll03/g;->y:Landroid/content/Context;

    iget-object v1, p0, Ll03/g;->x:Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;

    iget-object v2, p0, Ll03/g;->z:Ll03/h;

    invoke-static {v0, v1, v2, p1, p2}, Ll03/h;->z(Landroid/content/Context;Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Ll03/h;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ll03/g;->y:Landroid/content/Context;

    iget-object v1, p0, Ll03/g;->x:Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;

    iget-object v2, p0, Ll03/g;->z:Ll03/h;

    invoke-static {v0, v1, v2, p1, p2}, Ll03/h;->x(Landroid/content/Context;Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Ll03/h;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
