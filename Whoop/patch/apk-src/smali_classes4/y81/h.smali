.class public final Ly81/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly81/e;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0004H\u0017\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\r\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001a\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Ly81/h;",
        "Ly81/e;",
        "Lkotlin/Function1;",
        "Ly81/i;",
        "Li2/x;",
        "colorFactory",
        "<init>",
        "(Lkotlin/jvm/functions/Function1;)V",
        "toComposableColor-WaAFU9c",
        "(Landroidx/compose/runtime/Composer;I)J",
        "toComposableColor",
        "toTestableColor-0d7_KjU",
        "()J",
        "toTestableColor",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "",
        "hashCode",
        "()I",
        "",
        "toString",
        "()Ljava/lang/String;",
        "w",
        "Lkotlin/jvm/functions/Function1;",
        "design_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final w:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "colorFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly81/h;->w:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    const-class v2, Ly81/h;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    return v2

    :cond_2
    const-string v1, "null cannot be cast to non-null type com.whoop.design.atomic.theme.color.WhoopColorProvider"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ly81/h;

    invoke-virtual {p0}, Ly81/h;->toTestableColor-0d7_KjU()J

    move-result-wide v3

    invoke-virtual {p1}, Ly81/h;->toTestableColor-0d7_KjU()J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Li2/x;->d(JJ)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 3

    invoke-virtual {p0}, Ly81/h;->toTestableColor-0d7_KjU()J

    move-result-wide v0

    sget v2, Li2/x;->o:I

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    return v0
.end method

.method public toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J
    .locals 2

    check-cast p1, Lp1/q;

    const p2, 0x81e80ce

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    sget-object p2, Lx81/d;->a:Lx81/d;

    const/4 v0, 0x6

    invoke-virtual {p2, p1, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p2

    iget-object v0, p0, Ly81/h;->w:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Li2/x;

    iget-wide v0, p2, Li2/x;->a:J

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Ly81/h;->toTestableColor-0d7_KjU()J

    move-result-wide v0

    invoke-static {v0, v1}, Li2/x;->j(J)Ljava/lang/String;

    move-result-object v0

    const-string v1, "WhoopColorProvider("

    const-string v2, ")"

    invoke-static {v1, v0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toTestableColor-0d7_KjU()J
    .locals 2

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    iget-object v1, p0, Ly81/h;->w:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li2/x;

    iget-wide v0, v0, Li2/x;->a:J

    return-wide v0
.end method
