.class public final synthetic Lb30/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Le30/c;


# direct methods
.method public synthetic constructor <init>(Le30/c;I)V
    .locals 0

    iput p2, p0, Lb30/h0;->w:I

    iput-object p1, p0, Lb30/h0;->x:Le30/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lb30/h0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/List;

    const-string v0, "visiblePaymentMethods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hiddenPaymentMethods"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb30/h0;->x:Le30/c;

    iget-object v1, v0, Le30/c;->x:Lk20/a;

    invoke-virtual {v0}, Le30/c;->r()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La30/n1;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, p2, v0, v2}, Lk20/a;->l(Ljava/util/List;Ljava/util/List;La30/n1;Z)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lq20/y;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    iget-object v0, p0, Lb30/h0;->x:Le30/c;

    if-eqz p2, :cond_0

    invoke-virtual {v0, p1}, Le30/c;->u(Lq20/y;)V

    goto :goto_1

    :cond_0
    invoke-virtual {v0, p1}, Le30/c;->z(Lq20/y;)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Lq20/y;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    iget-object v0, p0, Lb30/h0;->x:Le30/c;

    if-eqz p2, :cond_1

    invoke-virtual {v0, p1}, Le30/c;->u(Lq20/y;)V

    goto :goto_2

    :cond_1
    invoke-virtual {v0, p1}, Le30/c;->z(Lq20/y;)V

    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/List;

    const-string v0, "visiblePaymentMethods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hiddenPaymentMethods"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb30/h0;->x:Le30/c;

    iget-object v1, v0, Le30/c;->x:Lk20/a;

    invoke-virtual {v0}, Le30/c;->r()Lec3/f2;

    move-result-object v2

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La30/n1;

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    iget-boolean v0, v0, Le30/c;->G:Z

    if-eqz v0, :cond_2

    goto :goto_3

    :cond_2
    move-object v2, v3

    :goto_3
    const/4 v0, 0x0

    invoke-virtual {v1, p1, p2, v2, v0}, Lk20/a;->l(Ljava/util/List;Ljava/util/List;La30/n1;Z)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
