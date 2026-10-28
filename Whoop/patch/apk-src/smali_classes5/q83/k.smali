.class public final Lq83/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq83/j;
.implements Ljava/io/Serializable;


# static fields
.field public static final w:Lq83/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq83/k;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lq83/k;->w:Lq83/k;

    return-void
.end method


# virtual methods
.method public final fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;
    .locals 0

    return-object p1
.end method

.method public final get(Lq83/i;)Lq83/h;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final hashCode()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final minusKey(Lq83/i;)Lq83/j;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final plus(Lq83/j;)Lq83/j;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "EmptyCoroutineContext"

    return-object v0
.end method
