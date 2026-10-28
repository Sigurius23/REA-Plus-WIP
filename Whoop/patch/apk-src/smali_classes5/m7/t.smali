.class public final Lm7/t;
.super Lkotlin/jvm/internal/j;
.source "SourceFile"


# instance fields
.field public final a:Lm7/r;


# direct methods
.method public constructor <init>(Lm7/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm7/t;->a:Lm7/r;

    return-void
.end method


# virtual methods
.method public final W()Lm7/r;
    .locals 1

    iget-object v0, p0, Lm7/t;->a:Lm7/r;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lm7/t;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lm7/t;

    iget-object p1, p1, Lm7/t;->a:Lm7/r;

    iget-object v0, p0, Lm7/t;->a:Lm7/r;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
