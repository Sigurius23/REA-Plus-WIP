.class final Ldx0/d$a$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldx0/d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lf6/a;",
        "preferences",
        "Ll83/a0;",
        "<anonymous>",
        "(Lf6/a;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.dataSyncService.ProcessNowApiImpl$triggerSync$1$1"
    f = "ProcessNowApiImpl.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:J

.field final synthetic z:Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;


# direct methods
.method public constructor <init>(JLcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;",
            "Lq83/d<",
            "-",
            "Ldx0/d$a$a;",
            ">;)V"
        }
    .end annotation

    iput-wide p1, p0, Ldx0/d$a$a;->y:J

    iput-object p3, p0, Ldx0/d$a$a;->z:Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Ldx0/d$a$a;

    iget-wide v1, p0, Ldx0/d$a$a;->y:J

    iget-object v3, p0, Ldx0/d$a$a;->z:Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

    invoke-direct {v0, v1, v2, v3, p2}, Ldx0/d$a$a;-><init>(JLcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;Lq83/d;)V

    iput-object p1, v0, Ldx0/d$a$a;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lf6/a;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf6/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Ldx0/d$a$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ldx0/d$a$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ldx0/d$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lf6/a;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ldx0/d$a$a;->invoke(Lf6/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Ldx0/d$a$a;->x:Ljava/lang/Object;

    check-cast v0, Lf6/a;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ldx0/d$a$a;->w:I

    if-nez v1, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {}, Ldt0/a;->b()Lf6/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lf6/a;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_0

    const-string p1, "{}"

    :cond_0
    :try_start_0
    sget-object v1, Lad3/c;->d:Lad3/b;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v2, v3, v3}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    invoke-virtual {v1, v2, p1}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-static {p1}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    :goto_0
    iget-wide v1, p0, Ldx0/d$a$a;->y:J

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ldx0/d$a$a;->z:Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ldt0/a;->b()Lf6/d;

    move-result-object v1

    sget-object v2, Lad3/c;->d:Lad3/b;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v4, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v3, v4, v4}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    invoke-virtual {v2, v3, p1}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lf6/a;->g(Lf6/d;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
