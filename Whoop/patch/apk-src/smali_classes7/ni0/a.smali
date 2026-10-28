.class public final synthetic Lni0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/navigation/CachePolicyModel;

.field public final synthetic y:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/navigation/CachePolicyModel;Ljava/lang/String;I)V
    .locals 0

    iput p3, p0, Lni0/a;->w:I

    iput-object p1, p0, Lni0/a;->x:Lcom/whoop/navigation/CachePolicyModel;

    iput-object p2, p0, Lni0/a;->y:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lni0/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lni0/a;->x:Lcom/whoop/navigation/CachePolicyModel;

    iget-object v1, p0, Lni0/a;->y:Ljava/lang/String;

    invoke-static {v0, v1}, Lni0/c;->c(Lcom/whoop/navigation/CachePolicyModel;Ljava/lang/String;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lni0/a;->x:Lcom/whoop/navigation/CachePolicyModel;

    iget-object v1, p0, Lni0/a;->y:Ljava/lang/String;

    invoke-static {v0, v1}, Lni0/c;->b(Lcom/whoop/navigation/CachePolicyModel;Ljava/lang/String;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lni0/a;->x:Lcom/whoop/navigation/CachePolicyModel;

    iget-object v1, p0, Lni0/a;->y:Ljava/lang/String;

    invoke-static {v0, v1}, Lni0/c;->i(Lcom/whoop/navigation/CachePolicyModel;Ljava/lang/String;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
