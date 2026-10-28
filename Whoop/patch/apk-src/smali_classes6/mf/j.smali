.class public final Lmf/j;
.super Lmf/l;
.source "SourceFile"


# static fields
.field public static final a:Lmf/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmf/j;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lmf/j;->a:Lmf/j;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Long;
    .locals 2

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public final c()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    instance-of v0, p1, Lmf/l;

    if-eqz v0, :cond_1

    check-cast p1, Lmf/l;

    invoke-virtual {p1}, Lmf/l;->a()Ljava/lang/Long;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-nez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
