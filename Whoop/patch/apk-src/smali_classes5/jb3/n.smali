.class public final Ljb3/n;
.super Ljava/lang/Object;

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final x:Ljb3/p;

.field public final y:Ljb3/q;


# direct methods
.method public synthetic constructor <init>(Ljb3/p;Ljb3/q;I)V
    .locals 0

    iput p3, p0, Ljb3/n;->w:I

    iput-object p1, p0, Ljb3/n;->x:Ljb3/p;

    iput-object p2, p0, Ljb3/n;->y:Ljb3/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ljb3/n;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ljb3/n;->x:Ljb3/p;

    iget-object v0, v0, Ljb3/p;->b:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, Ljb3/n;->y:Ljb3/q;

    invoke-virtual {v1}, Ljb3/q;->i()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Ldt/b;->E(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ljb3/n;->x:Ljb3/p;

    iget-object v0, v0, Ljb3/p;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, Ljb3/n;->y:Ljb3/q;

    invoke-virtual {v1}, Ljb3/q;->h()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Ldt/b;->E(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
