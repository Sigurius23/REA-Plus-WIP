.class public abstract Lcom/google/crypto/tink/shaded/protobuf/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/p0;
.implements Ljava/lang/Cloneable;


# instance fields
.field public final w:Lcom/google/crypto/tink/shaded/protobuf/x;

.field public x:Lcom/google/crypto/tink/shaded/protobuf/x;


# direct methods
.method public constructor <init>(Lcom/google/crypto/tink/shaded/protobuf/x;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/v;->w:Lcom/google/crypto/tink/shaded/protobuf/x;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/x;->p()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/x;->s()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p1

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/v;->x:Lcom/google/crypto/tink/shaded/protobuf/x;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Default instance must be immutable."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final b()Lcom/google/crypto/tink/shaded/protobuf/x;
    .locals 2

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/v;->c()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/x;->o(Lcom/google/crypto/tink/shaded/protobuf/x;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/UninitializedMessageException;

    invoke-direct {v0}, Lcom/google/crypto/tink/shaded/protobuf/UninitializedMessageException;-><init>()V

    throw v0
.end method

.method public final c()Lcom/google/crypto/tink/shaded/protobuf/x;
    .locals 2

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/v;->x:Lcom/google/crypto/tink/shaded/protobuf/x;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->p()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/v;->x:Lcom/google/crypto/tink/shaded/protobuf/x;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/v;->x:Lcom/google/crypto/tink/shaded/protobuf/x;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/x0;->a()Lcom/google/crypto/tink/shaded/protobuf/x0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/x0;->c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/a1;->b(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->q()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/v;->x:Lcom/google/crypto/tink/shaded/protobuf/x;

    return-object v0
.end method

.method public final d()Lcom/google/crypto/tink/shaded/protobuf/v;
    .locals 2

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/v;->w:Lcom/google/crypto/tink/shaded/protobuf/x;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->r()Lcom/google/crypto/tink/shaded/protobuf/v;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/v;->c()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v1

    iput-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/v;->x:Lcom/google/crypto/tink/shaded/protobuf/x;

    return-object v0
.end method

.method public final e()V
    .locals 3

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/v;->x:Lcom/google/crypto/tink/shaded/protobuf/x;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->p()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/v;->w:Lcom/google/crypto/tink/shaded/protobuf/x;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->s()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v0

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/v;->x:Lcom/google/crypto/tink/shaded/protobuf/x;

    sget-object v2, Lcom/google/crypto/tink/shaded/protobuf/x0;->c:Lcom/google/crypto/tink/shaded/protobuf/x0;

    invoke-virtual {v2, v0}, Lcom/google/crypto/tink/shaded/protobuf/x0;->c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v2

    invoke-interface {v2, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/v;->x:Lcom/google/crypto/tink/shaded/protobuf/x;

    :cond_0
    return-void
.end method

.method public final f(Lcom/google/crypto/tink/shaded/protobuf/x;)V
    .locals 2

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/v;->w:Lcom/google/crypto/tink/shaded/protobuf/x;

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/x;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/v;->e()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/v;->x:Lcom/google/crypto/tink/shaded/protobuf/x;

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/x0;->c:Lcom/google/crypto/tink/shaded/protobuf/x0;

    invoke-virtual {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/x0;->c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v1

    invoke-interface {v1, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
