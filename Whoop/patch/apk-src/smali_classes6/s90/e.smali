.class public final synthetic Ls90/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Ls90/h;

.field public final synthetic z:Lp1/a1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ls90/h;Lp1/a1;I)V
    .locals 0

    iput p4, p0, Ls90/e;->w:I

    iput-object p1, p0, Ls90/e;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Ls90/e;->y:Ls90/h;

    iput-object p3, p0, Ls90/e;->z:Lp1/a1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Ls90/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ls90/e;->z:Lp1/a1;

    check-cast p1, Ls90/c;

    iget-object v1, p0, Ls90/e;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Ls90/e;->y:Ls90/h;

    invoke-static {v1, v2, v0, p1}, Ls90/g;->g(Lkotlin/jvm/functions/Function1;Ls90/h;Lp1/a1;Ls90/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ls90/e;->z:Lp1/a1;

    check-cast p1, Lp1/i0;

    iget-object v1, p0, Ls90/e;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Ls90/e;->y:Ls90/h;

    invoke-static {v1, v2, v0, p1}, Ls90/g;->b(Lkotlin/jvm/functions/Function1;Ls90/h;Lp1/a1;Lp1/i0;)Lp1/h0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
