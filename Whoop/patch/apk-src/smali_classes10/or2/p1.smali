.class public final enum Lor2/p1;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lor2/p1;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0011\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B!\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0008\u001a\u0004\u0008\u000b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0008\u001a\u0004\u0008\u000c\u0010\nj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lor2/p1;",
        "",
        "",
        "slug",
        "longSlug",
        "region",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "Ljava/lang/String;",
        "getSlug",
        "()Ljava/lang/String;",
        "getLongSlug",
        "getRegion",
        "GERMAN",
        "ENGLISH",
        "FRENCH",
        "SPANISH",
        "ITALIAN",
        "PORTUGUESE",
        "feature_release"
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
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lor2/p1;

.field public static final enum ENGLISH:Lor2/p1;

.field public static final enum FRENCH:Lor2/p1;

.field public static final enum GERMAN:Lor2/p1;

.field public static final enum ITALIAN:Lor2/p1;

.field public static final enum PORTUGUESE:Lor2/p1;

.field public static final enum SPANISH:Lor2/p1;


# instance fields
.field private final longSlug:Ljava/lang/String;

.field private final region:Ljava/lang/String;

.field private final slug:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lor2/p1;
    .locals 6

    sget-object v0, Lor2/p1;->GERMAN:Lor2/p1;

    sget-object v1, Lor2/p1;->ENGLISH:Lor2/p1;

    sget-object v2, Lor2/p1;->FRENCH:Lor2/p1;

    sget-object v3, Lor2/p1;->SPANISH:Lor2/p1;

    sget-object v4, Lor2/p1;->ITALIAN:Lor2/p1;

    sget-object v5, Lor2/p1;->PORTUGUESE:Lor2/p1;

    filled-new-array/range {v0 .. v5}, [Lor2/p1;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lor2/p1;

    const-string v4, "de-eu"

    const-string v5, "eu"

    const-string v1, "GERMAN"

    const/4 v2, 0x0

    const-string v3, "de"

    invoke-direct/range {v0 .. v5}, Lor2/p1;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lor2/p1;->GERMAN:Lor2/p1;

    new-instance v1, Lor2/p1;

    const-string v5, "en-us"

    const-string v6, "us"

    const-string v2, "ENGLISH"

    const/4 v3, 0x1

    const-string v4, "en"

    invoke-direct/range {v1 .. v6}, Lor2/p1;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v1, Lor2/p1;->ENGLISH:Lor2/p1;

    new-instance v2, Lor2/p1;

    const-string v6, "fr-eu"

    const-string v7, "eu"

    const-string v3, "FRENCH"

    const/4 v4, 0x2

    const-string v5, "fr"

    invoke-direct/range {v2 .. v7}, Lor2/p1;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v2, Lor2/p1;->FRENCH:Lor2/p1;

    new-instance v3, Lor2/p1;

    const-string v7, "es-eu"

    const-string v8, "eu"

    const-string v4, "SPANISH"

    const/4 v5, 0x3

    const-string v6, "es"

    invoke-direct/range {v3 .. v8}, Lor2/p1;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v3, Lor2/p1;->SPANISH:Lor2/p1;

    new-instance v4, Lor2/p1;

    const-string v8, "it-eu"

    const-string v9, "eu"

    const-string v5, "ITALIAN"

    const/4 v6, 0x4

    const-string v7, "it"

    invoke-direct/range {v4 .. v9}, Lor2/p1;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v4, Lor2/p1;->ITALIAN:Lor2/p1;

    new-instance v5, Lor2/p1;

    const-string v9, "pt-eu"

    const-string v10, "eu"

    const-string v6, "PORTUGUESE"

    const/4 v7, 0x5

    const-string v8, "pt"

    invoke-direct/range {v5 .. v10}, Lor2/p1;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v5, Lor2/p1;->PORTUGUESE:Lor2/p1;

    invoke-static {}, Lor2/p1;->$values()[Lor2/p1;

    move-result-object v0

    sput-object v0, Lor2/p1;->$VALUES:[Lor2/p1;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lor2/p1;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lor2/p1;->slug:Ljava/lang/String;

    iput-object p4, p0, Lor2/p1;->longSlug:Ljava/lang/String;

    iput-object p5, p0, Lor2/p1;->region:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lor2/p1;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lor2/p1;
    .locals 1

    const-class v0, Lor2/p1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lor2/p1;

    return-object p0
.end method

.method public static values()[Lor2/p1;
    .locals 1

    sget-object v0, Lor2/p1;->$VALUES:[Lor2/p1;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lor2/p1;

    return-object v0
.end method


# virtual methods
.method public final getLongSlug()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lor2/p1;->longSlug:Ljava/lang/String;

    return-object v0
.end method

.method public final getRegion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lor2/p1;->region:Ljava/lang/String;

    return-object v0
.end method

.method public final getSlug()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lor2/p1;->slug:Ljava/lang/String;

    return-object v0
.end method
