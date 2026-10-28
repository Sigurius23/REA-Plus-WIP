.class public final synthetic Lyt2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/z0;


# direct methods
.method public synthetic constructor <init>(Lp1/z0;I)V
    .locals 0

    iput p2, p0, Lyt2/i;->w:I

    iput-object p1, p0, Lyt2/i;->x:Lp1/z0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lyt2/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lyt2/i;->x:Lp1/z0;

    check-cast p1, Li2/g0;

    invoke-static {v0, p1}, Lyt2/k;->l(Lp1/z0;Li2/g0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lyt2/i;->x:Lp1/z0;

    check-cast p1, Li2/g0;

    invoke-static {v0, p1}, Lyt2/k;->f(Lp1/z0;Li2/g0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lyt2/i;->x:Lp1/z0;

    check-cast p1, Li2/g0;

    invoke-static {v0, p1}, Lyt2/k;->j(Lp1/z0;Li2/g0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
