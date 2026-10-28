.class public final Lpj2/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpj2/e;
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

    iput-object v0, p0, Lpj2/e$a;->a:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public a()Lpj2/e;
    .locals 3

    new-instance v0, Lpj2/e;

    iget-object v1, p0, Lpj2/e$a;->a:Ljava/util/HashMap;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lpj2/e;-><init>(Ljava/util/HashMap;I)V

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lpj2/e$a;
    .locals 2

    iget-object v0, p0, Lpj2/e$a;->a:Ljava/util/HashMap;

    const-string v1, "sourceId"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method
