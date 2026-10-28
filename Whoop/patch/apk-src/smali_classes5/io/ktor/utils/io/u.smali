.class public final Lio/ktor/utils/io/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbc3/c0;


# instance fields
.field public final w:Lio/ktor/utils/io/m;

.field public final synthetic x:Lbc3/c0;


# direct methods
.method public constructor <init>(Lbc3/c0;Lio/ktor/utils/io/m;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lio/ktor/utils/io/u;->w:Lio/ktor/utils/io/m;

    iput-object p1, p0, Lio/ktor/utils/io/u;->x:Lbc3/c0;

    return-void
.end method


# virtual methods
.method public final getCoroutineContext()Lq83/j;
    .locals 1

    iget-object v0, p0, Lio/ktor/utils/io/u;->x:Lbc3/c0;

    invoke-interface {v0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v0

    return-object v0
.end method
