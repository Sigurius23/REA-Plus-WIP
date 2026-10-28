.class public final Llo2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J/\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00062\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0006\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Llo2/c;",
        "",
        "Lho2/a;",
        "analyticsHelper",
        "<init>",
        "(Lho2/a;)V",
        "Lec3/l;",
        "Lko2/c;",
        "universalCheckoutFlow",
        "Ljo2/b;",
        "stripeFlowControllerStateFlow",
        "Llo2/b;",
        "b",
        "(Lec3/l;Lec3/l;)Lec3/l;",
        "a",
        "Lho2/a;",
        "universal-checkout_release"
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
.field private final a:Lho2/a;


# direct methods
.method public constructor <init>(Lho2/a;)V
    .locals 1

    const-string v0, "analyticsHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llo2/c;->a:Lho2/a;

    return-void
.end method

.method public static final synthetic a(Llo2/c;)Lho2/a;
    .locals 0

    iget-object p0, p0, Llo2/c;->a:Lho2/a;

    return-object p0
.end method


# virtual methods
.method public final b(Lec3/l;Lec3/l;)Lec3/l;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "universalCheckoutFlow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeFlowControllerStateFlow"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llo2/c$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llo2/c$b;-><init>(Lq83/d;)V

    new-instance v2, Lec3/l1;

    const/4 v3, 0x1

    invoke-direct {v2, p1, p2, v0, v3}, Lec3/l1;-><init>(Lec3/l;Ljava/lang/Object;Ll83/e;I)V

    new-instance v4, Llo2/a;

    const/16 v10, 0x1f

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v11}, Llo2/a;-><init>(ZZZZLlo2/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p1, Llo2/c$c;

    invoke-direct {p1, p0, v1}, Llo2/c$c;-><init>(Llo2/c;Lq83/d;)V

    new-instance p2, Lec3/l1;

    invoke-direct {p2, v4, v2, p1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    const/4 p1, 0x1

    invoke-static {p2, p1}, Lec3/v;->v(Lec3/l;I)Lec3/h0;

    move-result-object p1

    new-instance p2, Llo2/c$a;

    invoke-direct {p2, p1}, Llo2/c$a;-><init>(Lec3/l;)V

    return-object p2
.end method
