.class public abstract Lb02/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0001\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Ln81/d;",
        "a",
        "Ln81/d;",
        "()Ln81/d;",
        "wywTagSelectorStyle",
        "native-store_release"
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
.field private static final a:Ln81/d;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Ln81/d;

    new-instance v1, Lm81/f;

    sget-object v2, Ly81/f;->BRAND_WHITE:Ly81/f;

    sget-object v3, Ly81/f;->BRAND_BLACK:Ly81/f;

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lm81/f;-><init>(Ly81/e;Ly81/e;Ly81/e;Ly81/e;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lm81/f;

    sget-object v6, Ly81/f;->BLACK_20:Ly81/f;

    const/4 v5, 0x1

    int-to-float v7, v5

    const/16 v9, 0x24

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    move-object v11, v4

    move-object v4, v2

    move-object v2, v11

    invoke-direct/range {v2 .. v10}, Lm81/f;-><init>(Ly81/e;Ly81/e;Ly81/e;Ly81/e;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v3, Lb91/c;->B1:Lb91/c;

    invoke-direct {v0, v1, v2, v3}, Ln81/d;-><init>(Lm81/f;Lm81/f;Lb91/c;)V

    sput-object v0, Lb02/g;->a:Ln81/d;

    return-void
.end method

.method public static final a()Ln81/d;
    .locals 1

    sget-object v0, Lb02/g;->a:Ln81/d;

    return-object v0
.end method
