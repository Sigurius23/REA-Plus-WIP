.class public final synthetic Lf1/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf1/m;
.implements Lkotlin/jvm/internal/f;


# instance fields
.field public final synthetic w:Lc93/a;


# direct methods
.method public constructor <init>(Lc93/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/g0;->w:Lc93/a;

    return-void
.end method


# virtual methods
.method public final synthetic a()J
    .locals 2

    iget-object v0, p0, Lf1/g0;->w:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh2/b;

    iget-wide v0, v0, Lh2/b;->a:J

    return-wide v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lf1/m;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    instance-of v0, p1, Lkotlin/jvm/internal/f;

    if-eqz v0, :cond_0

    invoke-interface {p0}, Lkotlin/jvm/internal/f;->getFunctionDelegate()Ll83/e;

    move-result-object v0

    check-cast p1, Lkotlin/jvm/internal/f;

    invoke-interface {p1}, Lkotlin/jvm/internal/f;->getFunctionDelegate()Ll83/e;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    return v1
.end method

.method public final getFunctionDelegate()Ll83/e;
    .locals 1

    iget-object v0, p0, Lf1/g0;->w:Lc93/a;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    invoke-interface {p0}, Lkotlin/jvm/internal/f;->getFunctionDelegate()Ll83/e;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
