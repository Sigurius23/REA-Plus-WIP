.class public final Lg40/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final w:Lg40/k0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg40/k0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lg40/k0;->w:Lg40/k0;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    check-cast p1, Lg40/h1;

    check-cast p2, Lg40/h1;

    instance-of v0, p1, Lg40/f1;

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    move p1, v3

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lg40/g1;

    if-eqz v0, :cond_1

    move p1, v2

    goto :goto_0

    :cond_1
    if-nez p1, :cond_5

    move p1, v1

    :goto_0
    instance-of v0, p2, Lg40/f1;

    if-eqz v0, :cond_2

    move v1, v3

    goto :goto_1

    :cond_2
    instance-of v0, p2, Lg40/g1;

    if-eqz v0, :cond_3

    move v1, v2

    goto :goto_1

    :cond_3
    if-nez p2, :cond_4

    :goto_1
    sub-int/2addr p1, v1

    return p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
