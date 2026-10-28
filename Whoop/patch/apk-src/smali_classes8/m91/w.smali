.class public final Lm91/w;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R+\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000bR7\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Lm91/w;",
        "",
        "<init>",
        "()V",
        "",
        "<set-?>",
        "a",
        "Lp1/a1;",
        "c",
        "()I",
        "e",
        "(I)V",
        "collapsedHeightPx",
        "Lkotlin/Function0;",
        "",
        "b",
        "Lp1/c1;",
        "d",
        "()Lc93/a;",
        "f",
        "(Lc93/a;)V",
        "expansionProgress",
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
.field private final a:Lp1/a1;

.field private final b:Lp1/c1;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lp1/h1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp1/h1;-><init>(I)V

    iput-object v0, p0, Lm91/w;->a:Lp1/a1;

    new-instance v0, Lm91/v;

    invoke-direct {v0, v1}, Lm91/v;-><init>(I)V

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Lm91/w;->b:Lp1/c1;

    return-void
.end method

.method public static synthetic a()F
    .locals 1

    invoke-static {}, Lm91/w;->b()F

    move-result v0

    return v0
.end method

.method private static final b()F
    .locals 1

    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final c()I
    .locals 1

    iget-object v0, p0, Lm91/w;->a:Lp1/a1;

    check-cast v0, Lp1/h1;

    invoke-virtual {v0}, Lp1/h1;->x()I

    move-result v0

    return v0
.end method

.method public final d()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lm91/w;->b:Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc93/a;

    return-object v0
.end method

.method public final e(I)V
    .locals 1

    iget-object v0, p0, Lm91/w;->a:Lp1/a1;

    check-cast v0, Lp1/h1;

    invoke-virtual {v0, p1}, Lp1/h1;->y(I)V

    return-void
.end method

.method public final f(Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm91/w;->b:Lp1/c1;

    invoke-interface {v0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method
