.class public final Lx81/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lof3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx81/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0006\u001a\u00028\u00008FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0002\u0010\u0003\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "x81/e$a",
        "Lof3/a;",
        "w",
        "Ll83/h;",
        "a",
        "()Ljava/lang/Object;",
        "value",
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
.field private final w:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lx81/e$a$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v2}, Lx81/e$a$a;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lx81/e$a;->w:Ll83/h;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/whoop/data/repositories/FeatureFlagChecker;"
        }
    .end annotation

    iget-object v0, p0, Lx81/e$a;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public bridge getKoin()Lnf3/a;
    .locals 1

    invoke-static {p0}, Lts/o;->A(Lof3/a;)Lnf3/a;

    move-result-object v0

    return-object v0
.end method
