.class public final Lya3/o;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lya3/o;->w:I

    iput-object p1, p0, Lya3/o;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lya3/o;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lr93/c;

    invoke-interface {p1}, Lr93/k;->g()Lr93/k;

    move-result-object p1

    iget-object v0, p0, Lya3/o;->x:Ljava/lang/Object;

    check-cast v0, Lr93/k;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lya3/o;->x:Ljava/lang/Object;

    check-cast v0, Lub3/h;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lub3/h;->add(Ljava/lang/Object;)Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
