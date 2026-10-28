.class public final Lue1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lue1/a;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/educationModels/MediaHeader;",
        "mediaHeader",
        "Lcom/whoop/educationModels/StickyButton;",
        "stickyButton",
        "Ly3/f;",
        "stickyButtonShadowHeight",
        "Ll0/k1;",
        "a",
        "(Lcom/whoop/educationModels/MediaHeader;Lcom/whoop/educationModels/StickyButton;F)Ll0/k1;",
        "education_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/whoop/educationModels/MediaHeader;Lcom/whoop/educationModels/StickyButton;F)Ll0/k1;
    .locals 4

    const/4 v0, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/16 v3, 0x8

    if-eqz p1, :cond_1

    const/4 p1, 0x4

    int-to-float p1, p1

    int-to-float v3, v3

    mul-float/2addr p1, v3

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    int-to-float p3, v2

    :goto_0
    add-float/2addr p1, p3

    invoke-static {v1, v1, v1, p1, v0}, Landroidx/compose/foundation/layout/a;->c(FFFFI)Ll0/l1;

    move-result-object p1

    return-object p1

    :cond_1
    int-to-float p1, v3

    mul-float/2addr p1, p1

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    int-to-float p3, v2

    :goto_1
    add-float/2addr p1, p3

    invoke-static {v1, v1, v1, p1, v0}, Landroidx/compose/foundation/layout/a;->c(FFFFI)Ll0/l1;

    move-result-object p1

    return-object p1
.end method
