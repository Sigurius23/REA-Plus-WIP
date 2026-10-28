.class public final Lqc/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/room/z0;

.field public final b:Lqc/b;

.field public final c:Lqc/t;


# direct methods
.method public constructor <init>(Landroidx/room/z0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqc/u;->a:Landroidx/room/z0;

    new-instance p1, Lqc/b;

    const/4 v0, 0x5

    invoke-direct {p1, v0}, Lqc/b;-><init>(I)V

    iput-object p1, p0, Lqc/u;->b:Lqc/b;

    new-instance p1, Lqc/t;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqc/u;->c:Lqc/t;

    return-void
.end method


# virtual methods
.method public final a(Ltb/a;La0/g;)V
    .locals 6

    invoke-virtual {p2}, La0/g;->keySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, La0/c;

    iget-object v1, v0, La0/c;->w:La0/g;

    invoke-virtual {v1}, La0/f1;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    :cond_0
    iget v2, p2, La0/f1;->y:I

    const/16 v3, 0x3e7

    const/4 v4, 0x0

    if-le v2, v3, :cond_1

    new-instance v0, Lqc/s;

    invoke-direct {v0, p0, p1, v4}, Lqc/s;-><init>(Lqc/u;Ltb/a;I)V

    invoke-static {p2, v0}, Lse/b;->X(La0/g;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_1
    const-string v2, "SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN ("

    invoke-static {v2}, Lih0/d0;->o(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v1, v1, La0/f1;->y:I

    invoke-static {v1, v2}, Lpf/c;->j(ILjava/lang/StringBuilder;)V

    const-string v1, ")"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "toString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v1}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p1

    invoke-virtual {v0}, La0/c;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x1

    move v2, v1

    :goto_0
    move-object v3, v0

    check-cast v3, La0/m;

    invoke-virtual {v3}, La0/m;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v3}, La0/m;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {p1, v2, v3}, Ltb/c;->L(ILjava/lang/String;)V

    add-int/2addr v2, v1

    goto :goto_0

    :cond_2
    :try_start_0
    const-string v0, "work_spec_id"

    invoke-static {p1, v0}, Ljc/x;->M(Ltb/c;Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_3

    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    return-void

    :cond_3
    :goto_1
    :try_start_1
    invoke-interface {p1}, Ltb/c;->e1()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_3

    invoke-interface {p1, v4}, Ltb/c;->getBlob(I)[B

    move-result-object v2

    sget-object v3, Lic/g;->b:Lic/g;

    invoke-static {v2}, Lpf/c;->t([B)Lic/g;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :cond_4
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    return-void

    :goto_2
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    throw p2
.end method

.method public final b(Ltb/a;La0/g;)V
    .locals 5

    invoke-virtual {p2}, La0/g;->keySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, La0/c;

    iget-object v1, v0, La0/c;->w:La0/g;

    invoke-virtual {v1}, La0/f1;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    :cond_0
    iget v2, p2, La0/f1;->y:I

    const/16 v3, 0x3e7

    if-le v2, v3, :cond_1

    new-instance v0, Lqc/s;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lqc/s;-><init>(Lqc/u;Ltb/a;I)V

    invoke-static {p2, v0}, Lse/b;->X(La0/g;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_1
    const-string v2, "SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN ("

    invoke-static {v2}, Lih0/d0;->o(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v1, v1, La0/f1;->y:I

    invoke-static {v1, v2}, Lpf/c;->j(ILjava/lang/StringBuilder;)V

    const-string v1, ")"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "toString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v1}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p1

    invoke-virtual {v0}, La0/c;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x1

    move v2, v1

    :goto_0
    move-object v3, v0

    check-cast v3, La0/m;

    invoke-virtual {v3}, La0/m;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v3}, La0/m;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {p1, v2, v3}, Ltb/c;->L(ILjava/lang/String;)V

    add-int/2addr v2, v1

    goto :goto_0

    :cond_2
    :try_start_0
    const-string v0, "work_spec_id"

    invoke-static {p1, v0}, Ljc/x;->M(Ltb/c;Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_3

    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    return-void

    :cond_3
    :goto_1
    :try_start_1
    invoke-interface {p1}, Ltb/c;->e1()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_3

    const/4 v2, 0x0

    invoke-interface {p1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :cond_4
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    return-void

    :goto_2
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    throw p2
.end method

.method public final c(Ljava/lang/String;)V
    .locals 3

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Le61/g;

    const/16 v1, 0x10

    invoke-direct {v0, p1, v1}, Le61/g;-><init>(Ljava/lang/String;I)V

    iget-object p1, p0, Lqc/u;->a:Landroidx/room/z0;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p1, v1, v2, v0}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method

.method public final d(Ljava/lang/String;)Lic/m0;
    .locals 3

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Le61/g;

    const/16 v1, 0xa

    invoke-direct {v0, p1, v1}, Le61/g;-><init>(Ljava/lang/String;I)V

    iget-object p1, p0, Lqc/u;->a:Landroidx/room/z0;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v1, v2, v0}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lic/m0;

    return-object p1
.end method

.method public final e(Ljava/lang/String;)Lqc/q;
    .locals 3

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Le61/g;

    const/16 v1, 0x9

    invoke-direct {v0, p1, v1}, Le61/g;-><init>(Ljava/lang/String;I)V

    iget-object p1, p0, Lqc/u;->a:Landroidx/room/z0;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v1, v2, v0}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lqc/q;

    return-object p1
.end method

.method public final f(Ljava/lang/String;)Ljava/util/List;
    .locals 3

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Le61/g;

    const/16 v1, 0x11

    invoke-direct {v0, p1, v1}, Le61/g;-><init>(Ljava/lang/String;I)V

    iget-object p1, p0, Lqc/u;->a:Landroidx/room/z0;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v1, v2, v0}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public final g(JLjava/lang/String;)I
    .locals 2

    const-string v0, "id"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljx0/d;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p3, p1, p2}, Ljx0/d;-><init>(ILjava/lang/String;J)V

    iget-object p1, p0, Lqc/u;->a:Landroidx/room/z0;

    const/4 p2, 0x0

    const/4 p3, 0x1

    invoke-static {p1, p2, p3, v0}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1
.end method

.method public final h(ILjava/lang/String;)V
    .locals 2

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/data/local/room/dao/persistent/h;

    const/4 v1, 0x2

    invoke-direct {v0, p2, p1, v1}, Lcom/whoop/data/local/room/dao/persistent/h;-><init>(Ljava/lang/String;II)V

    iget-object p1, p0, Lqc/u;->a:Landroidx/room/z0;

    const/4 p2, 0x0

    const/4 v1, 0x1

    invoke-static {p1, p2, v1, v0}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method

.method public final i(JLjava/lang/String;)V
    .locals 2

    const-string v0, "id"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljx0/d;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p3, p1, p2}, Ljx0/d;-><init>(ILjava/lang/String;J)V

    iget-object p1, p0, Lqc/u;->a:Landroidx/room/z0;

    const/4 p2, 0x0

    const/4 p3, 0x1

    invoke-static {p1, p2, p3, v0}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method

.method public final j(Lic/m0;Ljava/lang/String;)I
    .locals 2

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lp3/b0;

    const/4 v1, 0x5

    invoke-direct {v0, v1, p1, p2}, Lp3/b0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Lqc/u;->a:Landroidx/room/z0;

    const/4 p2, 0x0

    const/4 v1, 0x1

    invoke-static {p1, p2, v1, v0}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1
.end method

.method public final k(ILjava/lang/String;)V
    .locals 2

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/data/local/room/dao/persistent/h;

    invoke-direct {v0, p1, p2}, Lcom/whoop/data/local/room/dao/persistent/h;-><init>(ILjava/lang/String;)V

    iget-object p1, p0, Lqc/u;->a:Landroidx/room/z0;

    const/4 p2, 0x0

    const/4 v1, 0x1

    invoke-static {p1, p2, v1, v0}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method
