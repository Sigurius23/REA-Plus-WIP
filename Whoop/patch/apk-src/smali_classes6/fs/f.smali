.class public final Lfs/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lfs/f;

.field public static final d:Lfs/f;

.field public static final e:Lfs/f;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lfs/f;

    const-string v1, "ENABLED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lfs/f;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lfs/f;->c:Lfs/f;

    new-instance v0, Lfs/f;

    const-string v1, "DISABLED"

    invoke-direct {v0, v1, v2}, Lfs/f;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lfs/f;->d:Lfs/f;

    new-instance v0, Lfs/f;

    const-string v1, "DESTROYED"

    invoke-direct {v0, v1, v2}, Lfs/f;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lfs/f;->e:Lfs/f;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lfs/f;->a:I

    iput-object p1, p0, Lfs/f;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public declared-synchronized a(Lvs/p3;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-static {p1}, Lfs/o;->b(Lvs/p3;)Lvs/m3;

    move-result-object v0

    invoke-virtual {p1}, Lvs/p3;->D()Lvs/h4;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lfs/f;->b(Lvs/m3;Lvs/h4;)Lvs/t3;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit p0

    iget-object v0, p0, Lfs/f;->b:Ljava/lang/Object;

    check-cast v0, Lvs/r3;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->e()V

    iget-object v0, v0, Lcom/google/crypto/tink/shaded/protobuf/v;->x:Lcom/google/crypto/tink/shaded/protobuf/x;

    check-cast v0, Lvs/u3;

    invoke-static {v0, p1}, Lvs/u3;->A(Lvs/u3;Lvs/t3;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p1

    :goto_0
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1

    :catchall_1
    move-exception p1

    goto :goto_0
.end method

.method public declared-synchronized b(Lvs/m3;Lvs/h4;)Lvs/t3;
    .locals 3

    monitor-enter p0

    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-static {}, Lcom/google/crypto/tink/internal/r0;->b()I

    move-result v0

    :goto_0
    invoke-virtual {p0, v0}, Lfs/f;->d(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lcom/google/crypto/tink/internal/r0;->b()I

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :try_start_2
    monitor-exit p0

    sget-object v1, Lvs/h4;->x:Lvs/h4;

    if-eq p2, v1, :cond_1

    invoke-static {}, Lvs/t3;->I()Lvs/s3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/v;->e()V

    iget-object v2, v1, Lcom/google/crypto/tink/shaded/protobuf/v;->x:Lcom/google/crypto/tink/shaded/protobuf/x;

    check-cast v2, Lvs/t3;

    invoke-static {v2, p1}, Lvs/t3;->z(Lvs/t3;Lvs/m3;)V

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/v;->e()V

    iget-object p1, v1, Lcom/google/crypto/tink/shaded/protobuf/v;->x:Lcom/google/crypto/tink/shaded/protobuf/x;

    check-cast p1, Lvs/t3;

    invoke-static {p1, v0}, Lvs/t3;->C(Lvs/t3;I)V

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/v;->e()V

    iget-object p1, v1, Lcom/google/crypto/tink/shaded/protobuf/v;->x:Lcom/google/crypto/tink/shaded/protobuf/x;

    check-cast p1, Lvs/t3;

    invoke-static {p1}, Lvs/t3;->B(Lvs/t3;)V

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/v;->e()V

    iget-object p1, v1, Lcom/google/crypto/tink/shaded/protobuf/v;->x:Lcom/google/crypto/tink/shaded/protobuf/x;

    check-cast p1, Lvs/t3;

    invoke-static {p1, p2}, Lvs/t3;->A(Lvs/t3;Lvs/h4;)V

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p1

    check-cast p1, Lvs/t3;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit p0

    return-object p1

    :catchall_1
    move-exception p1

    goto :goto_2

    :cond_1
    :try_start_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "unknown output prefix type"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_1
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw p1

    :goto_2
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw p1
.end method

.method public declared-synchronized c()Lfs/h;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lfs/f;->b:Ljava/lang/Object;

    check-cast v0, Lvs/r3;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v0

    check-cast v0, Lvs/u3;

    invoke-static {v0}, Lfs/h;->a(Lvs/u3;)Lfs/h;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized d(I)Z
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lfs/f;->b:Ljava/lang/Object;

    check-cast v0, Lvs/r3;

    iget-object v0, v0, Lcom/google/crypto/tink/shaded/protobuf/v;->x:Lcom/google/crypto/tink/shaded/protobuf/x;

    check-cast v0, Lvs/u3;

    invoke-virtual {v0}, Lvs/u3;->D()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lvs/t3;

    invoke-virtual {v1}, Lvs/t3;->E()I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v1, p1, :cond_0

    monitor-exit p0

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    monitor-exit p0

    const/4 p1, 0x0

    return p1

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lfs/f;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lfs/f;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
