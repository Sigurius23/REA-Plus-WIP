.class public final Lbm/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lbm/t;


# direct methods
.method public synthetic constructor <init>(Lbm/t;I)V
    .locals 0

    iput p2, p0, Lbm/e;->w:I

    iput-object p1, p0, Lbm/e;->x:Lbm/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 1

    iget p2, p0, Lbm/e;->w:I

    packed-switch p2, :pswitch_data_0

    check-cast p1, Ljava/lang/Integer;

    iget-object p1, p0, Lbm/e;->x:Lbm/t;

    invoke-virtual {p1}, Lbm/t;->j()Ln0/g;

    move-result-object p2

    if-eqz p2, :cond_0

    check-cast p2, Ln0/o;

    invoke-virtual {p2}, Ln0/o;->getIndex()I

    move-result p2

    invoke-virtual {p1}, Lbm/t;->m()I

    move-result v0

    if-eq p2, v0, :cond_0

    iget-object p1, p1, Lbm/t;->b:Lp1/k1;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p0, Lbm/e;->x:Lbm/t;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lbm/t;->p(Ljava/lang/Integer;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
