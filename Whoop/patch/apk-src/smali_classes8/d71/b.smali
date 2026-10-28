.class public final Ld71/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Ld71/b;",
        "",
        "<init>",
        "()V",
        "Le71/b;",
        "barState",
        "Lk91/a;",
        "a",
        "(Le71/b;)Lk91/a;",
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


# static fields
.field public static final a:Ld71/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ld71/b;

    invoke-direct {v0}, Ld71/b;-><init>()V

    sput-object v0, Ld71/b;->a:Ld71/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Le71/b;)Lk91/a;
    .locals 7

    const-string v0, "barState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Le71/b;->f()F

    move-result v2

    invoke-virtual {p1}, Le71/b;->f()F

    move-result v3

    invoke-virtual {p1}, Le71/b;->b()F

    move-result v5

    invoke-virtual {p1}, Le71/b;->b()F

    move-result v4

    new-instance v1, Lk91/a;

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v6}, Lk91/a;-><init>(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
