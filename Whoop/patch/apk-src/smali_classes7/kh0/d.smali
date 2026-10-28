.class public final synthetic Lkh0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(ILp1/c1;)V
    .locals 0

    iput p1, p0, Lkh0/d;->w:I

    iput-object p2, p0, Lkh0/d;->x:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lkh0/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lkh0/d;->x:Lp1/c1;

    check-cast p1, Ly3/l;

    invoke-static {v0, p1}, Lkh0/e;->a(Lp1/c1;Ly3/l;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lkh0/d;->x:Lp1/c1;

    check-cast p1, Ld0/e;

    invoke-static {v0, p1}, Lkh0/e$a$a;->f(Lp1/c1;Ld0/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
