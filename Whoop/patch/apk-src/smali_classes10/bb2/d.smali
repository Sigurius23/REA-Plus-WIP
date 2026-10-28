.class public final synthetic Lbb2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:Lp1/t2;


# direct methods
.method public synthetic constructor <init>(FLp1/t2;I)V
    .locals 0

    iput p3, p0, Lbb2/d;->w:I

    iput p1, p0, Lbb2/d;->x:F

    iput-object p2, p0, Lbb2/d;->y:Lp1/t2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lbb2/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbb2/d;->y:Lp1/t2;

    check-cast p1, Lk2/e;

    iget v1, p0, Lbb2/d;->x:F

    invoke-static {v1, v0, p1}, Luz1/n;->d(FLp1/t2;Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lbb2/d;->y:Lp1/t2;

    check-cast p1, Lk2/e;

    iget v1, p0, Lbb2/d;->x:F

    invoke-static {v1, v0, p1}, Lrs2/a;->c(FLp1/t2;Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lbb2/d;->y:Lp1/t2;

    check-cast p1, Ly3/c;

    iget v1, p0, Lbb2/d;->x:F

    invoke-static {v1, v0, p1}, Lrm1/h;->g(FLp1/t2;Ly3/c;)Ly3/j;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lbb2/d;->y:Lp1/t2;

    check-cast p1, Lk2/e;

    iget v1, p0, Lbb2/d;->x:F

    invoke-static {v1, v0, p1}, Lbb2/f;->a(FLp1/t2;Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
