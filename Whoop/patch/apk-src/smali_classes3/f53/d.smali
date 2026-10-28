.class public final Lf53/d;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lx43/m;


# direct methods
.method public synthetic constructor <init>(Lx43/m;I)V
    .locals 0

    iput p2, p0, Lf53/d;->w:I

    iput-object p1, p0, Lf53/d;->x:Lx43/m;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lf53/d;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lx43/k;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf53/d;->x:Lx43/m;

    invoke-virtual {p1, v0}, Lx43/k;->g(Lx43/m;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lx43/k;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf53/d;->x:Lx43/m;

    invoke-virtual {p1, v0}, Lx43/k;->g(Lx43/m;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
