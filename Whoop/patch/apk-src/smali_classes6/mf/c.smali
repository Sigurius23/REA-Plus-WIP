.class public final Lmf/c;
.super La2/a;
.source "SourceFile"

# interfaces
.implements Lvg/d;


# instance fields
.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lmf/c;->y:I

    const/4 p1, 0x3

    invoke-direct {p0, p1}, La2/a;-><init>(I)V

    return-void
.end method


# virtual methods
.method public Q()Lmf/d;
    .locals 3

    new-instance v0, Lmf/d;

    iget-object v1, p0, La2/a;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    const-string v2, "values"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lgf/u;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method public final a()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lmf/c;->y:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La2/a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    invoke-static {v0}, Lds/p;->A(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    new-instance v1, Lmf/c;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lmf/c;-><init>(I)V

    iget-object v2, v1, La2/a;->x:Ljava/lang/Object;

    check-cast v2, Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-object v1

    :pswitch_0
    iget-object v0, p0, La2/a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    invoke-static {v0}, Lds/p;->A(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    new-instance v1, Lmf/c;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lmf/c;-><init>(I)V

    iget-object v2, v1, La2/a;->x:Ljava/lang/Object;

    check-cast v2, Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lmf/c;->y:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HeadersBuilder "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, La2/a;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
