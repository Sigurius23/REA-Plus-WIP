.class public final Ln20/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv03/d;


# instance fields
.field public final E:Lv03/h;

.field public final synthetic w:I

.field public final x:Lv03/h;

.field public final y:Lv03/h;

.field public final z:Lv03/h;


# direct methods
.method public synthetic constructor <init>(ILv03/d;Lv03/h;Lv03/h;Lv03/h;)V
    .locals 0

    iput p1, p0, Ln20/q;->w:I

    iput-object p3, p0, Ln20/q;->x:Lv03/h;

    iput-object p4, p0, Ln20/q;->y:Lv03/h;

    iput-object p2, p0, Ln20/q;->z:Lv03/h;

    iput-object p5, p0, Ln20/q;->E:Lv03/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 7

    iget v0, p0, Ln20/q;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ln20/q;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Ln20/q;->y:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    iget-object v2, p0, Ln20/q;->z:Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb10/d;

    iget-object v3, p0, Ln20/q;->E:Lv03/h;

    invoke-interface {v3}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lyy/j;

    new-instance v4, Lzx/o;

    invoke-direct {v4, v0, v1, v2, v3}, Lzx/o;-><init>(Landroid/content/Context;Ljava/util/Set;Lb10/d;Lyy/j;)V

    return-object v4

    :pswitch_0
    iget-object v0, p0, Ln20/q;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln20/c;

    iget-object v1, p0, Ln20/q;->y:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Ln20/q;->z:Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/link/LinkActivityContract;

    iget-object v3, p0, Ln20/q;->E:Lv03/h;

    invoke-interface {v3}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lxz/n0;

    new-instance v4, Lwz/r0;

    invoke-direct {v4, v0, v1, v2, v3}, Lwz/r0;-><init>(Ln20/c;Ljava/lang/String;Lcom/stripe/android/link/LinkActivityContract;Lxz/n0;)V

    return-object v4

    :pswitch_1
    iget-object v0, p0, Ln20/q;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln20/c;

    iget-object v1, p0, Ln20/q;->y:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/link/LinkActivityContract;

    iget-object v2, p0, Ln20/q;->z:Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Ln20/q;->E:Lv03/h;

    invoke-interface {v3}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lxz/n0;

    const-string v4, "linkAnalyticsComponentFactory"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "linkActivityContract"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "identifier"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "linkStore"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lwz/r0;

    invoke-direct {v4, v0, v2, v1, v3}, Lwz/r0;-><init>(Ln20/c;Ljava/lang/String;Lcom/stripe/android/link/LinkActivityContract;Lxz/n0;)V

    return-object v4

    :pswitch_2
    iget-object v0, p0, Ln20/q;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln20/c;

    iget-object v1, p0, Ln20/q;->y:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/link/LinkActivityContract;

    iget-object v2, p0, Ln20/q;->z:Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Ln20/q;->E:Lv03/h;

    invoke-interface {v3}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lxz/n0;

    const-string v4, "linkAnalyticsComponentFactory"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "linkActivityContract"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "identifier"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "linkStore"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lwz/r0;

    invoke-direct {v4, v0, v2, v1, v3}, Lwz/r0;-><init>(Ln20/c;Ljava/lang/String;Lcom/stripe/android/link/LinkActivityContract;Lxz/n0;)V

    return-object v4

    :pswitch_3
    iget-object v0, p0, Ln20/q;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, La30/a0;

    iget-object v0, p0, Ln20/q;->y:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lq83/j;

    iget-object v0, p0, Ln20/q;->z:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ln20/u;

    new-instance v5, Lg73/a;

    const/16 v0, 0x1c

    invoke-direct {v5, v0}, Lg73/a;-><init>(I)V

    iget-object v0, p0, Ln20/q;->E:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ln20/k;

    new-instance v1, Ln20/p;

    invoke-direct/range {v1 .. v6}, Ln20/p;-><init>(La30/a0;Lq83/j;Ln20/u;Lg73/a;Ln20/k;)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
