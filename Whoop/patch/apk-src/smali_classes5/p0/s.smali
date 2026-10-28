.class public final synthetic Lp0/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ll2/c;

.field public final synthetic y:Lp0/t;


# direct methods
.method public synthetic constructor <init>(Ll2/c;Lp0/t;I)V
    .locals 0

    iput p3, p0, Lp0/s;->w:I

    iput-object p1, p0, Lp0/s;->x:Ll2/c;

    iput-object p2, p0, Lp0/s;->y:Lp0/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lp0/s;->w:I

    check-cast p1, Ld0/e;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iget-object v0, p0, Lp0/s;->x:Ll2/c;

    invoke-virtual {v0, p1}, Ll2/c;->e(F)V

    iget-object p1, p0, Lp0/s;->y:Lp0/t;

    iget-object p1, p1, Lp0/t;->c:Lnr0/e;

    invoke-virtual {p1}, Lnr0/e;->invoke()Ljava/lang/Object;

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    invoke-virtual {p1}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iget-object v0, p0, Lp0/s;->x:Ll2/c;

    invoke-virtual {v0, p1}, Ll2/c;->e(F)V

    iget-object p1, p0, Lp0/s;->y:Lp0/t;

    iget-object p1, p1, Lp0/t;->c:Lnr0/e;

    invoke-virtual {p1}, Lnr0/e;->invoke()Ljava/lang/Object;

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
