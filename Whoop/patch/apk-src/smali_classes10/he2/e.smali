.class public final synthetic Lhe2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lbc3/c0;

.field public final synthetic y:Lp1/c1;

.field public final synthetic z:Lg1/y3;


# direct methods
.method public synthetic constructor <init>(ILbc3/c0;Lg1/y3;Lp1/c1;)V
    .locals 0

    iput p1, p0, Lhe2/e;->w:I

    iput-object p2, p0, Lhe2/e;->x:Lbc3/c0;

    iput-object p4, p0, Lhe2/e;->y:Lp1/c1;

    iput-object p3, p0, Lhe2/e;->z:Lg1/y3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lhe2/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhe2/e;->z:Lg1/y3;

    check-cast p1, Ljava/util/List;

    iget-object v1, p0, Lhe2/e;->x:Lbc3/c0;

    iget-object v2, p0, Lhe2/e;->y:Lp1/c1;

    invoke-static {v1, v2, v0, p1}, Lpj2/i;->z(Lbc3/c0;Lp1/c1;Lg1/y3;Ljava/util/List;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lhe2/e;->z:Lg1/y3;

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Lhe2/e;->x:Lbc3/c0;

    iget-object v2, p0, Lhe2/e;->y:Lp1/c1;

    invoke-static {v1, v2, v0, p1}, Lot1/c;->g(Lbc3/c0;Lp1/c1;Lg1/y3;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lhe2/e;->z:Lg1/y3;

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Lhe2/e;->x:Lbc3/c0;

    iget-object v2, p0, Lhe2/e;->y:Lp1/c1;

    invoke-static {v1, v2, v0, p1}, Lhe2/h;->l(Lbc3/c0;Lp1/c1;Lg1/y3;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
