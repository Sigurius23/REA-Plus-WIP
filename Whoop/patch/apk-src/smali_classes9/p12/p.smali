.class public final synthetic Lp12/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp12/f;

.field public final synthetic y:Li91/h;


# direct methods
.method public synthetic constructor <init>(Lp12/f;Li91/h;I)V
    .locals 0

    iput p3, p0, Lp12/p;->w:I

    iput-object p1, p0, Lp12/p;->x:Lp12/f;

    iput-object p2, p0, Lp12/p;->y:Li91/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lp12/p;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lp12/p;->y:Li91/h;

    check-cast p1, Lk2/c;

    iget-object v1, p0, Lp12/p;->x:Lp12/f;

    invoke-static {v1, v0, p1}, Lp12/x;->B(Lp12/f;Li91/h;Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lp12/p;->y:Li91/h;

    check-cast p1, Lf2/d;

    iget-object v1, p0, Lp12/p;->x:Lp12/f;

    invoke-static {v1, v0, p1}, Lp12/x;->q(Lp12/f;Li91/h;Lf2/d;)Lf2/g;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
