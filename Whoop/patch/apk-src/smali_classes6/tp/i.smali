.class public final Ltp/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public b:Z

.field public c:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    .line 1
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ltp/i;->a:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-boolean v0, p0, Ltp/i;->b:Z

    iput-boolean v0, p0, Ltp/i;->c:Z

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;ZZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Ltp/i;->a:Ljava/util/ArrayList;

    .line 4
    iput-boolean p2, p0, Ltp/i;->c:Z

    .line 5
    iput-boolean p3, p0, Ltp/i;->b:Z

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/location/LocationRequest;)V
    .locals 1

    iget-object v0, p0, Ltp/i;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public b()Ltp/j;
    .locals 5

    new-instance v0, Ltp/j;

    iget-boolean v1, p0, Ltp/i;->b:Z

    iget-boolean v2, p0, Ltp/i;->c:Z

    const/4 v3, 0x0

    iget-object v4, p0, Ltp/i;->a:Ljava/util/ArrayList;

    invoke-direct {v0, v4, v1, v2, v3}, Ltp/j;-><init>(Ljava/util/ArrayList;ZZLtp/c0;)V

    return-object v0
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ltp/i;->b:Z

    return-void
.end method

.method public d()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ltp/i;->c:Z

    return-void
.end method
