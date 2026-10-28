.class public final synthetic Lbm2/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/c1;

.field public final synthetic y:Lp1/c1;

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lp1/c1;Lp1/c1;Lp1/c1;I)V
    .locals 0

    iput p4, p0, Lbm2/x;->w:I

    iput-object p1, p0, Lbm2/x;->x:Lp1/c1;

    iput-object p2, p0, Lbm2/x;->y:Lp1/c1;

    iput-object p3, p0, Lbm2/x;->z:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lbm2/x;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbm2/x;->z:Lp1/c1;

    check-cast p1, Lg2/v;

    iget-object v1, p0, Lbm2/x;->x:Lp1/c1;

    iget-object v2, p0, Lbm2/x;->y:Lp1/c1;

    invoke-static {v1, v2, v0, p1}, Lw80/b;->f(Lp1/c1;Lp1/c1;Lp1/c1;Lg2/v;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lbm2/x;->z:Lp1/c1;

    check-cast p1, Landroid/content/Context;

    iget-object v1, p0, Lbm2/x;->x:Lp1/c1;

    iget-object v2, p0, Lbm2/x;->y:Lp1/c1;

    invoke-static {v1, v2, v0, p1}, Lkd1/d;->j(Lp1/c1;Lp1/c1;Lp1/c1;Landroid/content/Context;)Landroid/webkit/WebView;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lbm2/x;->z:Lp1/c1;

    check-cast p1, Ljava/util/Set;

    iget-object v1, p0, Lbm2/x;->x:Lp1/c1;

    iget-object v2, p0, Lbm2/x;->y:Lp1/c1;

    invoke-static {v1, v2, v0, p1}, Lhb2/j;->j(Lp1/c1;Lp1/c1;Lp1/c1;Ljava/util/Set;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lbm2/x;->z:Lp1/c1;

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Lbm2/x;->x:Lp1/c1;

    iget-object v2, p0, Lbm2/x;->y:Lp1/c1;

    invoke-static {v1, v2, v0, p1}, Lbm2/e0;->a(Lp1/c1;Lp1/c1;Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lbm2/x;->z:Lp1/c1;

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Lbm2/x;->x:Lp1/c1;

    iget-object v2, p0, Lbm2/x;->y:Lp1/c1;

    invoke-static {v1, v2, v0, p1}, Lbm2/e0;->f(Lp1/c1;Lp1/c1;Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lbm2/x;->z:Lp1/c1;

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Lbm2/x;->x:Lp1/c1;

    iget-object v2, p0, Lbm2/x;->y:Lp1/c1;

    invoke-static {v1, v2, v0, p1}, Lbm2/e0;->r(Lp1/c1;Lp1/c1;Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
