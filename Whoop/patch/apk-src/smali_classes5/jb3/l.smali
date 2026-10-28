.class public final Ljb3/l;
.super Ljava/lang/Object;

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final x:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lc93/a;I)V
    .locals 0

    iput p2, p0, Ljb3/l;->w:I

    iput-object p1, p0, Ljb3/l;->x:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ljb3/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ljb3/l;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    instance-of v1, v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/a;

    if-eqz v1, :cond_0

    check-cast v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/a;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/a;->a()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    :cond_0
    return-object v0

    :pswitch_0
    iget-object v0, p0, Ljb3/l;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
