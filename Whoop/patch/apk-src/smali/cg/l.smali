.class public final synthetic Lcg/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/iterable/iterableapi/b;

.field public final synthetic y:Lcg/j;

.field public final synthetic z:Lcg/t;


# direct methods
.method public synthetic constructor <init>(Lcom/iterable/iterableapi/b;Lcg/j;Lcg/t;I)V
    .locals 0

    iput p4, p0, Lcg/l;->w:I

    iput-object p1, p0, Lcg/l;->x:Lcom/iterable/iterableapi/b;

    iput-object p2, p0, Lcg/l;->y:Lcg/j;

    iput-object p3, p0, Lcg/l;->z:Lcg/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lcg/l;->w:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "#"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcg/m;

    const/4 v2, 0x0

    iget-object v3, p0, Lcg/l;->y:Lcg/j;

    iget-object v4, p0, Lcg/l;->z:Lcg/t;

    invoke-direct {v1, v3, v4, v2}, Lcg/m;-><init>(Lcg/j;Lcg/t;I)V

    iget-object v2, p0, Lcg/l;->x:Lcom/iterable/iterableapi/b;

    invoke-virtual {v2, v0, v1}, Lcom/iterable/iterableapi/b;->c([Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    const-string v0, "?"

    const-string v1, "#"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lbp0/n;

    const/4 v2, 0x2

    iget-object v3, p0, Lcg/l;->y:Lcg/j;

    iget-object v4, p0, Lcg/l;->z:Lcg/t;

    invoke-direct {v1, v2, v3, v4}, Lbp0/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object v2, p0, Lcg/l;->x:Lcom/iterable/iterableapi/b;

    invoke-virtual {v2, v0, v1}, Lcom/iterable/iterableapi/b;->c([Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
