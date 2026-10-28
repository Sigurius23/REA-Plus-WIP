.class public final Lc0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/h0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Lc0/g;->a:I

    iput-object p1, p0, Lc0/g;->c:Ljava/lang/Object;

    iput-object p2, p0, Lc0/g;->b:Ljava/lang/Object;

    iput-object p3, p0, Lc0/g;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 4

    iget v0, p0, Lc0/g;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc0/g;->c:Ljava/lang/Object;

    check-cast v0, Ly1/d;

    iget-object v1, v0, Ly1/d;->x:La0/v0;

    iget-object v2, p0, Lc0/g;->b:Ljava/lang/Object;

    invoke-virtual {v1, v2}, La0/v0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iget-object v3, p0, Lc0/g;->d:Ljava/lang/Object;

    check-cast v3, Ly1/i;

    if-ne v1, v3, :cond_1

    iget-object v0, v0, Ly1/d;->w:Ljava/util/Map;

    invoke-virtual {v3}, Ly1/i;->e()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lc0/g;->c:Ljava/lang/Object;

    check-cast v0, Lz1/p;

    iget-object v1, p0, Lc0/g;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lz1/p;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Lc0/g;->d:Ljava/lang/Object;

    check-cast v0, Lc0/x;

    iget-object v0, v0, Lc0/x;->e:La0/v0;

    invoke-virtual {v0, v1}, La0/v0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
