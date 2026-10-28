.class public final synthetic Lv01/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lny0/h;

.field public final synthetic y:Lcom/whoop/analytics/AnalyticEventModel;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lny0/h;Lcom/whoop/analytics/AnalyticEventModel;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p4, p0, Lv01/j;->w:I

    iput-object p1, p0, Lv01/j;->x:Lny0/h;

    iput-object p2, p0, Lv01/j;->y:Lcom/whoop/analytics/AnalyticEventModel;

    iput-object p3, p0, Lv01/j;->z:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lv01/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lv01/j;->y:Lcom/whoop/analytics/AnalyticEventModel;

    iget-object v1, p0, Lv01/j;->z:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lv01/j;->x:Lny0/h;

    invoke-static {v2, v0, v1}, Lw01/g;->a(Lny0/h;Lcom/whoop/analytics/AnalyticEventModel;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lv01/j;->y:Lcom/whoop/analytics/AnalyticEventModel;

    iget-object v1, p0, Lv01/j;->z:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lv01/j;->x:Lny0/h;

    invoke-static {v2, v0, v1}, Lv01/l;->o(Lny0/h;Lcom/whoop/analytics/AnalyticEventModel;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
