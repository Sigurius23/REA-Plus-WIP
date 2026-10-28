.class public final Ll80/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj02/k0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B%\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Ll80/r;",
        "Lj02/k0;",
        "",
        "homeGraphStartDestinationId",
        "activationFragmentId",
        "Lj02/i0;",
        "navDeepLinkRequestHelper",
        "<init>",
        "(IILj02/i0;)V",
        "Lj02/m0$d;",
        "screen",
        "a",
        "(Lj02/m0$d;)I",
        "Lj02/m0;",
        "navigationScreen",
        "Lj02/j0;",
        "provideNavigationData",
        "(Lj02/m0;)Lj02/j0;",
        "I",
        "b",
        "c",
        "Lj02/i0;",
        "activation_release"
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
.field public static final d:I


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Lj02/i0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lj02/i0;->a:I

    sput v0, Ll80/r;->d:I

    return-void
.end method

.method public constructor <init>(IILj02/i0;)V
    .locals 1

    const-string v0, "navDeepLinkRequestHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Ll80/r;->a:I

    .line 3
    iput p2, p0, Ll80/r;->b:I

    .line 4
    iput-object p3, p0, Ll80/r;->c:Lj02/i0;

    return-void
.end method

.method public synthetic constructor <init>(IILj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    .line 5
    new-instance p3, Lj02/i0;

    invoke-direct {p3}, Lj02/i0;-><init>()V

    .line 6
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Ll80/r;-><init>(IILj02/i0;)V

    return-void
.end method

.method private final a(Lj02/m0$d;)I
    .locals 1

    invoke-virtual {p1}, Lj02/m0$d;->b()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_0
    iget p1, p0, Ll80/r;->b:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_2
    iget p1, p0, Ll80/r;->a:I

    return p1
.end method


# virtual methods
.method public provideNavigationData(Lj02/m0;)Lj02/j0;
    .locals 14

    const-string v0, "navigationScreen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lj02/m0$d;

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    check-cast p1, Lj02/m0$d;

    invoke-virtual {p1}, Lj02/m0$d;->d()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "android-app://com.whoop/activation?startScreen="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lj02/m0$d;->c()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v2}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "&source="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll80/r;->c:Lj02/i0;

    invoke-virtual {v1, v0}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v3

    invoke-direct {p0, p1}, Ll80/r;->a(Lj02/m0$d;)I

    move-result v7

    if-eqz v7, :cond_1

    new-instance v4, Leb/x0;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, -0x1

    move v11, v10

    move v12, v10

    move v13, v10

    invoke-direct/range {v4 .. v13}, Leb/x0;-><init>(ZZIZZIIII)V

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    new-instance v2, Lj02/j0$c;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_2
    sget-object p1, Lj02/j0$d;->a:Lj02/j0$d;

    return-object p1
.end method
