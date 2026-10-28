.class public final Ljb3/e;
.super Ljava/lang/Object;

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final x:Ljb3/g;


# direct methods
.method public synthetic constructor <init>(Ljb3/g;I)V
    .locals 0

    iput p2, p0, Ljb3/e;->w:I

    iput-object p1, p0, Ljb3/e;->x:Ljb3/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Ljb3/e;->w:I

    iget-object v1, p0, Ljb3/e;->x:Ljb3/g;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Ljb3/g;->g:Lmb3/f;

    iget-object v1, v1, Ljb3/g;->j:Ljb3/h;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "classDescriptor"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljb3/h;->e()Llb3/q0;

    move-result-object v0

    check-cast v0, Llb3/f;

    invoke-virtual {v0}, Llb3/f;->getSupertypes()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "getSupertypes(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :pswitch_0
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->m:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;->a:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/m;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lz93/c;->w:Lz93/c;

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/l;->w:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/l;

    invoke-virtual {v1, v0, v2}, Ljb3/q;->b(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
