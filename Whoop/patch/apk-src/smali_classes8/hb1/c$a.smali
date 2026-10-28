.class public final Lhb1/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhb1/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J1\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lhb1/c$a;",
        "",
        "<init>",
        "()V",
        "Ly3/f;",
        "maxHeight",
        "maxWidth",
        "contentHeightDp",
        "contentWidthDp",
        "",
        "a",
        "(FFFF)Ljava/lang/String;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lhb1/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(FFFF)Ljava/lang/String;
    .locals 4

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    cmpg-float v0, v0, v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-gtz v0, :cond_0

    invoke-static {p3, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-lez p1, :cond_0

    move p1, v3

    goto :goto_0

    :cond_0
    move p1, v2

    :goto_0
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p3

    cmpg-float p3, p3, v1

    if-gtz p3, :cond_1

    invoke-static {p4, p2}, Ljava/lang/Float;->compare(FF)I

    move-result p2

    if-lez p2, :cond_1

    move v2, v3

    :cond_1
    if-eqz p1, :cond_2

    if-eqz v2, :cond_2

    const-string p1, "both"

    return-object p1

    :cond_2
    if-eqz p1, :cond_3

    const-string p1, "vertical"

    return-object p1

    :cond_3
    if-eqz v2, :cond_4

    const-string p1, "horizontal"

    return-object p1

    :cond_4
    const/4 p1, 0x0

    return-object p1
.end method
