.class public final synthetic Lzc1/h5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/c1;

.field public final synthetic y:Lp1/c1;

.field public final synthetic z:Lcom/whoop/design/atomic/organism/toolbar/d$a;


# direct methods
.method public synthetic constructor <init>(Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$a;I)V
    .locals 0

    iput p4, p0, Lzc1/h5;->w:I

    iput-object p1, p0, Lzc1/h5;->x:Lp1/c1;

    iput-object p2, p0, Lzc1/h5;->y:Lp1/c1;

    iput-object p3, p0, Lzc1/h5;->z:Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lzc1/h5;->w:I

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lzc1/h5;->x:Lp1/c1;

    iget-object v1, p0, Lzc1/h5;->y:Lp1/c1;

    iget-object v2, p0, Lzc1/h5;->z:Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-static {v0, v1, v2, p1}, Lzc1/i5;->c(Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$a;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lzc1/h5;->x:Lp1/c1;

    iget-object v1, p0, Lzc1/h5;->y:Lp1/c1;

    iget-object v2, p0, Lzc1/h5;->z:Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-static {v0, v1, v2, p1}, Lzc1/i5;->q(Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$a;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lzc1/h5;->x:Lp1/c1;

    iget-object v1, p0, Lzc1/h5;->y:Lp1/c1;

    iget-object v2, p0, Lzc1/h5;->z:Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-static {v0, v1, v2, p1}, Lzc1/i5;->i(Lp1/c1;Lp1/c1;Lcom/whoop/design/atomic/organism/toolbar/d$a;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
