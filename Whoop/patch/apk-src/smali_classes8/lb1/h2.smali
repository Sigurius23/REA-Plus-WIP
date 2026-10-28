.class public final Llb1/h2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/h2$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\t\u0010\u0008J\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\n\u0010\u0008J\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000b\u0010\u0008\u00a8\u0006\u000c"
    }
    d2 = {
        "Llb1/h2;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/design/models/items/ImpactStyle;",
        "impactStyle",
        "Ly81/f;",
        "c",
        "(Lcom/whoop/design/models/items/ImpactStyle;)Ly81/f;",
        "a",
        "d",
        "b",
        "design-models_release"
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
.field public static final a:Llb1/h2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Llb1/h2;

    invoke-direct {v0}, Llb1/h2;-><init>()V

    sput-object v0, Llb1/h2;->a:Llb1/h2;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/whoop/design/models/items/ImpactStyle;)Ly81/f;
    .locals 1

    const-string v0, "impactStyle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/h2$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    sget-object p1, Ly81/f;->WHITE_10:Ly81/f;

    return-object p1

    :cond_0
    sget-object p1, Ly81/f;->ACCENT_NEGATIVE_TREND_15:Ly81/f;

    return-object p1

    :cond_1
    sget-object p1, Ly81/f;->ACCENT_POSITIVE_TREND_15:Ly81/f;

    return-object p1
.end method

.method public final b(Lcom/whoop/design/models/items/ImpactStyle;)Ly81/f;
    .locals 1

    const-string v0, "impactStyle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/h2$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    sget-object p1, Ly81/f;->WHITE_50:Ly81/f;

    return-object p1

    :cond_0
    sget-object p1, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    return-object p1

    :cond_1
    sget-object p1, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    return-object p1
.end method

.method public final c(Lcom/whoop/design/models/items/ImpactStyle;)Ly81/f;
    .locals 1

    const-string v0, "impactStyle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/h2$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    sget-object p1, Ly81/f;->WHITE_50:Ly81/f;

    return-object p1

    :cond_0
    sget-object p1, Ly81/f;->BRAND_WHITE:Ly81/f;

    return-object p1

    :cond_1
    sget-object p1, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    return-object p1

    :cond_2
    sget-object p1, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    return-object p1
.end method

.method public final d(Lcom/whoop/design/models/items/ImpactStyle;)Ly81/f;
    .locals 1

    const-string v0, "impactStyle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/h2$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    sget-object p1, Ly81/f;->WHITE_50:Ly81/f;

    return-object p1

    :cond_0
    sget-object p1, Ly81/f;->BRAND_WHITE:Ly81/f;

    return-object p1

    :cond_1
    sget-object p1, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    return-object p1

    :cond_2
    sget-object p1, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    return-object p1
.end method
