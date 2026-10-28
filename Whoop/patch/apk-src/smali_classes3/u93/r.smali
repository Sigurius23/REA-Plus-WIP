.class public final Lu93/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lu93/t;


# direct methods
.method public synthetic constructor <init>(Lu93/t;I)V
    .locals 0

    iput p2, p0, Lu93/r;->w:I

    iput-object p1, p0, Lu93/r;->x:Lu93/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lu93/r;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lva3/h;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lu93/r;->x:Lu93/t;

    invoke-virtual {v0}, Lu93/t;->b()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v1

    sget-object v2, Lz93/c;->F:Lz93/c;

    invoke-interface {v1, p1, v2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;->getContributedVariables(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lu93/t;->c(Lva3/h;Ljava/util/Collection;)Ljava/util/LinkedHashSet;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x4

    invoke-static {p1}, Lu93/t;->a(I)V

    const/4 p1, 0x0

    throw p1

    :pswitch_0
    check-cast p1, Lva3/h;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lu93/r;->x:Lu93/t;

    invoke-virtual {v0}, Lu93/t;->b()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v1

    sget-object v2, Lz93/c;->F:Lz93/c;

    invoke-interface {v1, p1, v2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;->getContributedFunctions(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lu93/t;->c(Lva3/h;Ljava/util/Collection;)Ljava/util/LinkedHashSet;

    move-result-object p1

    return-object p1

    :cond_1
    const/16 p1, 0x8

    invoke-static {p1}, Lu93/t;->a(I)V

    const/4 p1, 0x0

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
