.class public final Lv62/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010!\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001e\u0010\n\u001a\u00020\t2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0080@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001e\u0010\r\u001a\u00020\t2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0080@\u00a2\u0006\u0004\u0008\r\u0010\u000bJ\u0015\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0011R\u001a\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0013R\u001a\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "Lv62/a;",
        "",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Ltr2/n;)V",
        "",
        "Lcom/whoop/removeDeviceConfig/domain/dto/PropertyValuesInfo;",
        "newProperties",
        "Ll83/a0;",
        "c",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "strapProperties",
        "d",
        "a",
        "()Ljava/util/List;",
        "b",
        "Ltr2/n;",
        "",
        "Ljava/util/List;",
        "serviceList",
        "strapList",
        "Lmc3/a;",
        "Lmc3/a;",
        "mutex",
        "remote-device-config_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Ltr2/n;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/removeDeviceConfig/domain/dto/PropertyValuesInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/removeDeviceConfig/domain/dto/PropertyValuesInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lmc3/a;


# direct methods
.method public constructor <init>(Ltr2/n;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lv62/a;->a:Ltr2/n;

    .line 3
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lv62/a;->b:Ljava/util/List;

    .line 4
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lv62/a;->c:Ljava/util/List;

    .line 5
    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p1

    iput-object p1, p0, Lv62/a;->d:Lmc3/a;

    return-void
.end method

.method public synthetic constructor <init>(Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 6
    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string p2, "RemoteDeviceProperties"

    invoke-virtual {p1, p2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    .line 7
    :cond_0
    invoke-direct {p0, p1}, Lv62/a;-><init>(Ltr2/n;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/removeDeviceConfig/domain/dto/PropertyValuesInfo;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lv62/a;->b:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/removeDeviceConfig/domain/dto/PropertyValuesInfo;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lv62/a;->c:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final c(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/removeDeviceConfig/domain/dto/PropertyValuesInfo;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "Fetched remote device properties - "

    instance-of v1, p2, Lv62/a$a;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, Lv62/a$a;

    iget v2, v1, Lv62/a$a;->F:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lv62/a$a;->F:I

    goto :goto_0

    :cond_0
    new-instance v1, Lv62/a$a;

    invoke-direct {v1, p0, p2}, Lv62/a$a;-><init>(Lv62/a;Lq83/d;)V

    :goto_0
    iget-object p2, v1, Lv62/a$a;->z:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lv62/a$a;->F:I

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v5, :cond_1

    iget-object p1, v1, Lv62/a$a;->x:Ljava/lang/Object;

    check-cast p1, Lmc3/a;

    iget-object v1, v1, Lv62/a$a;->w:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, p1

    move-object p1, v1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lv62/a;->d:Lmc3/a;

    iput-object p1, v1, Lv62/a$a;->w:Ljava/lang/Object;

    iput-object p2, v1, Lv62/a$a;->x:Ljava/lang/Object;

    iput v4, v1, Lv62/a$a;->y:I

    iput v5, v1, Lv62/a$a;->F:I

    invoke-interface {p2, v1}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_3

    return-object v2

    :cond_3
    :goto_1
    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lv62/a;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    iget-object v2, p0, Lv62/a;->b:Ljava/util/List;

    move-object v3, p1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v2, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v2, p0, Lv62/a;->a:Ltr2/n;

    move-object v5, p1

    check-cast v5, Ljava/lang/Iterable;

    const/4 v9, 0x0

    const/16 v10, 0x3f

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v4, [Lqr2/a$a;

    invoke-interface {v2, p1, v0}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p2, v1}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-interface {p2, v1}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method

.method public final d(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/removeDeviceConfig/domain/dto/PropertyValuesInfo;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lv62/a$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lv62/a$b;

    iget v1, v0, Lv62/a$b;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lv62/a$b;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lv62/a$b;

    invoke-direct {v0, p0, p2}, Lv62/a$b;-><init>(Lv62/a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lv62/a$b;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lv62/a$b;->F:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lv62/a$b;->x:Ljava/lang/Object;

    check-cast p1, Lmc3/a;

    iget-object v0, v0, Lv62/a$b;->w:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, p1

    move-object p1, v0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lv62/a;->d:Lmc3/a;

    iput-object p1, v0, Lv62/a$b;->w:Ljava/lang/Object;

    iput-object p2, v0, Lv62/a$b;->x:Ljava/lang/Object;

    iput v3, v0, Lv62/a$b;->y:I

    iput v4, v0, Lv62/a$b;->F:I

    invoke-interface {p2, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    const/4 v0, 0x0

    :try_start_0
    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lcom/whoop/removeDeviceConfig/domain/dto/PropertyValuesInfo;

    iget-object v5, p0, Lv62/a;->b:Ljava/util/List;

    check-cast v5, Ljava/lang/Iterable;

    instance-of v6, v5, Ljava/util/Collection;

    if-eqz v6, :cond_5

    move-object v6, v5

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_5

    goto :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_7

    :cond_5
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/removeDeviceConfig/domain/dto/PropertyValuesInfo;

    invoke-virtual {v6}, Lcom/whoop/removeDeviceConfig/domain/dto/PropertyValuesInfo;->getPropertyName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4}, Lcom/whoop/removeDeviceConfig/domain/dto/PropertyValuesInfo;->getPropertyName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    new-instance p1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    if-eqz v2, :cond_d

    :try_start_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/removeDeviceConfig/domain/dto/PropertyValuesInfo;

    iget-object v5, p0, Lv62/a;->b:Ljava/util/List;

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lcom/whoop/removeDeviceConfig/domain/dto/PropertyValuesInfo;

    invoke-virtual {v7}, Lcom/whoop/removeDeviceConfig/domain/dto/PropertyValuesInfo;->getPropertyName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2}, Lcom/whoop/removeDeviceConfig/domain/dto/PropertyValuesInfo;->getPropertyName()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    check-cast v6, Lcom/whoop/removeDeviceConfig/domain/dto/PropertyValuesInfo;

    iget-object v5, p0, Lv62/a;->c:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v7, v3

    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    const/4 v9, -0x1

    if-eqz v8, :cond_a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/removeDeviceConfig/domain/dto/PropertyValuesInfo;

    invoke-virtual {v8}, Lcom/whoop/removeDeviceConfig/domain/dto/PropertyValuesInfo;->getPropertyName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6}, Lcom/whoop/removeDeviceConfig/domain/dto/PropertyValuesInfo;->getPropertyName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_9

    goto :goto_5

    :cond_9
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_a
    move v7, v9

    :goto_5
    if-eq v7, v9, :cond_b

    iget-object v2, p0, Lv62/a;->c:Ljava/util/List;

    invoke-interface {v2, v7, v6}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :cond_b
    iget-object v4, p0, Lv62/a;->c:Ljava/util/List;

    new-instance v5, Lcom/whoop/removeDeviceConfig/domain/dto/PropertyValuesInfo;

    invoke-virtual {v2}, Lcom/whoop/removeDeviceConfig/domain/dto/PropertyValuesInfo;->getPropertyName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6}, Lcom/whoop/removeDeviceConfig/domain/dto/PropertyValuesInfo;->getUserValue()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6}, Lcom/whoop/removeDeviceConfig/domain/dto/PropertyValuesInfo;->getTarget()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v2, v7, v6}, Lcom/whoop/removeDeviceConfig/domain/dto/PropertyValuesInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    :goto_6
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3

    :cond_c
    new-instance p1, Ljava/util/NoSuchElementException;

    const-string v1, "Collection contains no element matching the predicate."

    invoke-direct {p1, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_d
    invoke-interface {p2, v0}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object v4

    :goto_7
    invoke-interface {p2, v0}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method
