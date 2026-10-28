.class public final Lc0/x0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ly2/j1;


# direct methods
.method public synthetic constructor <init>(Ly2/j1;I)V
    .locals 0

    iput p2, p0, Lc0/x0;->w:I

    iput-object p1, p0, Lc0/x0;->x:Ly2/j1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lc0/x0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ly2/i1;

    iget-object v0, p0, Lc0/x0;->x:Ly2/j1;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1, p1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Ly2/i1;

    iget-object v0, p0, Lc0/x0;->x:Ly2/j1;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1, p1}, Ly2/i1;->g(Ly2/j1;IILy2/i1;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Ly2/i1;

    iget-object v0, p0, Lc0/x0;->x:Ly2/j1;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1, p1}, Ly2/i1;->g(Ly2/j1;IILy2/i1;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
