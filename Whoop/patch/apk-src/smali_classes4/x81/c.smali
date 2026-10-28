.class public abstract Lx81/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0002\u0010\u0003\u001a\u0004\u0008\u0004\u0010\u0005\"#\u0010\r\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\u00080\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lp1/t1;",
        "Ly81/a;",
        "a",
        "Lp1/t1;",
        "c",
        "()Lp1/t1;",
        "LocalSemanticColors",
        "",
        "Lp1/u1;",
        "b",
        "[Lp1/u1;",
        "d",
        "()[Lp1/u1;",
        "LocalSemantics",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Lp1/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t1;"
        }
    .end annotation
.end field

.field private static final b:[Lp1/u1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lp1/u1;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lwe1/h;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lwe1/h;-><init>(I)V

    new-instance v1, Lp1/b0;

    invoke-direct {v1, v0}, Lp1/b0;-><init>(Lc93/a;)V

    sput-object v1, Lx81/c;->a:Lp1/t1;

    invoke-static {}, Ly81/c;->d()Ly81/a;

    move-result-object v0

    invoke-virtual {v1, v0}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v0

    filled-new-array {v0}, [Lp1/u1;

    move-result-object v0

    sput-object v0, Lx81/c;->b:[Lp1/u1;

    return-void
.end method

.method public static synthetic a()Ly81/a;
    .locals 1

    invoke-static {}, Lx81/c;->b()Ly81/a;

    move-result-object v0

    return-object v0
.end method

.method private static final b()Ly81/a;
    .locals 11

    new-instance v0, Ly81/a;

    const/16 v9, 0xf

    const/4 v10, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    invoke-direct/range {v0 .. v10}, Ly81/a;-><init>(JJJJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static final c()Lp1/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lp1/t1;"
        }
    .end annotation

    sget-object v0, Lx81/c;->a:Lp1/t1;

    return-object v0
.end method

.method public static final d()[Lp1/u1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lp1/u1;"
        }
    .end annotation

    sget-object v0, Lx81/c;->b:[Lp1/u1;

    return-object v0
.end method
