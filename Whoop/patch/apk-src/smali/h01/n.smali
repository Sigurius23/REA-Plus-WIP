.class public final synthetic Lh01/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/c1;

.field public final synthetic y:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(ILp1/c1;Lp1/c1;)V
    .locals 0

    iput p1, p0, Lh01/n;->w:I

    iput-object p2, p0, Lh01/n;->x:Lp1/c1;

    iput-object p3, p0, Lh01/n;->y:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lh01/n;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lh01/n;->x:Lp1/c1;

    iget-object v1, p0, Lh01/n;->y:Lp1/c1;

    invoke-static {v0, v1, p1}, Lun1/g;->e(Lp1/c1;Lp1/c1;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lh01/n;->x:Lp1/c1;

    iget-object v1, p0, Lh01/n;->y:Lp1/c1;

    invoke-static {v0, v1, p1}, Lun1/g;->h(Lp1/c1;Lp1/c1;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lh01/n;->x:Lp1/c1;

    iget-object v1, p0, Lh01/n;->y:Lp1/c1;

    invoke-static {v0, v1, p1}, Lum1/d;->i(Lp1/c1;Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lh01/n;->y:Lp1/c1;

    check-cast p1, Ll3/r0;

    iget-object v1, p0, Lh01/n;->x:Lp1/c1;

    invoke-static {v1, v0, p1}, Lh01/z;->g(Lp1/c1;Lp1/c1;Ll3/r0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lh01/n;->y:Lp1/c1;

    check-cast p1, Ll3/r0;

    iget-object v1, p0, Lh01/n;->x:Lp1/c1;

    invoke-static {v1, v0, p1}, Lh01/p;->b(Lp1/c1;Lp1/c1;Ll3/r0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
