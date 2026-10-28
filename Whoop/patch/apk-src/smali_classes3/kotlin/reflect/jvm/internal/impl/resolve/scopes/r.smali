.class public final Lkotlin/reflect/jvm/internal/impl/resolve/scopes/r;
.super Ljava/lang/Object;

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final x:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/s;


# direct methods
.method public synthetic constructor <init>(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/s;I)V
    .locals 0

    iput p2, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/r;->w:I

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/r;->x:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/r;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/r;->x:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/s;

    iget-boolean v1, v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/s;->c:Z

    if-eqz v1, :cond_0

    iget-object v0, v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/s;->b:Ljb3/h;

    invoke-static {v0}, Lya3/p;->g(Lu93/b;)Lu93/m0;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->L(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Lm83/y;->w:Lm83/y;

    :goto_0
    return-object v0

    :pswitch_0
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/r;->x:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/s;

    iget-object v0, v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/s;->b:Ljb3/h;

    invoke-static {v0}, Lya3/p;->h(Lu93/b;)Lu93/q0;

    move-result-object v1

    invoke-static {v0}, Lya3/p;->i(Lu93/b;)Lu93/q0;

    move-result-object v0

    filled-new-array {v1, v0}, [Lu93/q0;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
