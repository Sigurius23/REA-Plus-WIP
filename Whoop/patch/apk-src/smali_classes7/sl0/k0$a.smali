.class public final Lsl0/k0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsl0/k0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lsl0/k0$a;->a:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public a()Lsl0/k0;
    .locals 3

    new-instance v0, Lsl0/k0;

    iget-object v1, p0, Lsl0/k0$a;->a:Ljava/util/HashMap;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lsl0/k0;-><init>(Ljava/util/HashMap;I)V

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lsl0/k0$a;
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Lsl0/k0$a;->a:Ljava/util/HashMap;

    const-string v1, "conversationIdSeed"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Argument \"conversationIdSeed\" is marked as non-null but was passed a null value."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c(Ljava/lang/String;)Lsl0/k0$a;
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Lsl0/k0$a;->a:Ljava/util/HashMap;

    const-string v1, "sourceId"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Argument \"sourceId\" is marked as non-null but was passed a null value."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public d(Ljava/lang/String;)Lsl0/k0$a;
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Lsl0/k0$a;->a:Ljava/util/HashMap;

    const-string v1, "sourceType"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Argument \"sourceType\" is marked as non-null but was passed a null value."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
