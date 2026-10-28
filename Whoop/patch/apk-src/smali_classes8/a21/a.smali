.class public abstract La21/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0011\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\"\u0017\u0010\u0008\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0002\u001a\u0004\u0008\u0007\u0010\u0004\"\u0017\u0010\n\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0002\u001a\u0004\u0008\u0006\u0010\u0004\"\u0017\u0010\u000c\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0002\u001a\u0004\u0008\u000b\u0010\u0004\"\u0017\u0010\u000e\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0002\u001a\u0004\u0008\r\u0010\u0004\"\u0017\u0010\u000f\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0002\u001a\u0004\u0008\t\u0010\u0004\"\u0017\u0010\u0010\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0002\u001a\u0004\u0008\u0001\u0010\u0004\u00a8\u0006\u0011"
    }
    d2 = {
        "Ly11/q;",
        "a",
        "Ly11/q;",
        "d",
        "()Ly11/q;",
        "noImpactLabeledPreview",
        "b",
        "f",
        "positiveImpactLabeledPreview",
        "c",
        "negativeImpactLabeledPreview",
        "e",
        "noImpactPercentageLabeledPreview",
        "g",
        "positiveImpactPercentageLabeledPreview",
        "negativeImpactPercentageLabeledPreview",
        "labelOnlyPreview",
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
.field private static final a:Ly11/q;

.field private static final b:Ly11/q;

.field private static final c:Ly11/q;

.field private static final d:Ly11/q;

.field private static final e:Ly11/q;

.field private static final f:Ly11/q;

.field private static final g:Ly11/q;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Ly11/q;

    invoke-static {}, Lz11/a;->f()Ly11/r;

    move-result-object v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const-string v1, "No Impact"

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v5}, Ly11/q;-><init>(Ljava/lang/String;Ly81/f;Ly11/r;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, La21/a;->a:Ly11/q;

    new-instance v1, Ly11/q;

    invoke-static {}, Lz11/a;->h()Ly11/r;

    move-result-object v4

    const/4 v5, 0x2

    const/4 v6, 0x0

    const-string v2, "Positive"

    const/4 v3, 0x0

    invoke-direct/range {v1 .. v6}, Ly11/q;-><init>(Ljava/lang/String;Ly81/f;Ly11/r;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, La21/a;->b:Ly11/q;

    new-instance v2, Ly11/q;

    invoke-static {}, Lz11/a;->c()Ly11/r;

    move-result-object v5

    const/4 v6, 0x2

    const/4 v7, 0x0

    const-string v3, "Negative"

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v7}, Ly11/q;-><init>(Ljava/lang/String;Ly81/f;Ly11/r;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, La21/a;->c:Ly11/q;

    new-instance v0, Ly11/q;

    sget-object v1, Ly81/f;->BRAND_WHITE:Ly81/f;

    invoke-static {}, Lz11/a;->f()Ly11/r;

    move-result-object v2

    const-string v3, "0%"

    invoke-direct {v0, v3, v1, v2}, Ly11/q;-><init>(Ljava/lang/String;Ly81/f;Ly11/r;)V

    sput-object v0, La21/a;->d:Ly11/q;

    new-instance v0, Ly11/q;

    sget-object v1, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    invoke-static {}, Lz11/a;->h()Ly11/r;

    move-result-object v2

    const-string v3, "+15%"

    invoke-direct {v0, v3, v1, v2}, Ly11/q;-><init>(Ljava/lang/String;Ly81/f;Ly11/r;)V

    sput-object v0, La21/a;->e:Ly11/q;

    new-instance v0, Ly11/q;

    sget-object v1, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    invoke-static {}, Lz11/a;->c()Ly11/r;

    move-result-object v2

    const-string v3, "-8%"

    invoke-direct {v0, v3, v1, v2}, Ly11/q;-><init>(Ljava/lang/String;Ly81/f;Ly11/r;)V

    sput-object v0, La21/a;->f:Ly11/q;

    new-instance v4, Ly11/q;

    const/4 v8, 0x2

    const/4 v9, 0x0

    const-string v5, "Label Only"

    const/4 v6, 0x0

    invoke-direct/range {v4 .. v9}, Ly11/q;-><init>(Ljava/lang/String;Ly81/f;Ly11/r;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v4, La21/a;->g:Ly11/q;

    return-void
.end method

.method public static final a()Ly11/q;
    .locals 1

    sget-object v0, La21/a;->g:Ly11/q;

    return-object v0
.end method

.method public static final b()Ly11/q;
    .locals 1

    sget-object v0, La21/a;->c:Ly11/q;

    return-object v0
.end method

.method public static final c()Ly11/q;
    .locals 1

    sget-object v0, La21/a;->f:Ly11/q;

    return-object v0
.end method

.method public static final d()Ly11/q;
    .locals 1

    sget-object v0, La21/a;->a:Ly11/q;

    return-object v0
.end method

.method public static final e()Ly11/q;
    .locals 1

    sget-object v0, La21/a;->d:Ly11/q;

    return-object v0
.end method

.method public static final f()Ly11/q;
    .locals 1

    sget-object v0, La21/a;->b:Ly11/q;

    return-object v0
.end method

.method public static final g()Ly11/q;
    .locals 1

    sget-object v0, La21/a;->e:Ly11/q;

    return-object v0
.end method
