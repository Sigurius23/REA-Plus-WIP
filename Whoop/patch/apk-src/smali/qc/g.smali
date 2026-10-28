.class public final Lqc/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/room/z0;


# direct methods
.method public constructor <init>(Landroidx/room/z0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqc/g;->a:Landroidx/room/z0;

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

    new-instance v0, Lqc/f;

    invoke-direct {v0, p0, p1, v4}, Lqc/f;-><init>(Lqc/g;Ltb/a;I)V

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

    new-instance v0, Lqc/f;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lqc/f;-><init>(Lqc/g;Ltb/a;I)V

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
