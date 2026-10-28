.class public final Lg93/b;
.super Lg93/a;
.source "SourceFile"


# instance fields
.field public final y:Lat/b;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lat/b;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lat/b;-><init>(I)V

    iput-object v0, p0, Lg93/b;->y:Lat/b;

    return-void
.end method


# virtual methods
.method public final i()Ljava/util/Random;
    .locals 2

    iget-object v0, p0, Lg93/b;->y:Lat/b;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Random;

    return-object v0
.end method
