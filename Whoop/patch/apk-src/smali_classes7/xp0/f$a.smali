.class public final Lxp0/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxp0/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lxp0/f$a;->a:Ljava/util/HashMap;

    const-string v1, "pillarType"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_0

    const-string p1, "timePeriod"

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Argument \"timePeriod\" is marked as non-null but was passed a null value."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()Lxp0/f;
    .locals 3

    new-instance v0, Lxp0/f;

    iget-object v1, p0, Lxp0/f$a;->a:Ljava/util/HashMap;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lxp0/f;-><init>(Ljava/util/HashMap;I)V

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lxp0/f$a;
    .locals 2

    iget-object v0, p0, Lxp0/f$a;->a:Ljava/util/HashMap;

    const-string v1, "parentMessageId"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lxp0/f$a;
    .locals 2

    iget-object v0, p0, Lxp0/f$a;->a:Ljava/util/HashMap;

    const-string v1, "sourceId"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public d(Lcom/whoop/domain/model/teams/Team;)Lxp0/f$a;
    .locals 2

    iget-object v0, p0, Lxp0/f$a;->a:Ljava/util/HashMap;

    const-string v1, "team"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method
