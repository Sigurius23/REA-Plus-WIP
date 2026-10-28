.class public final enum Lse1/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lse1/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\r\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lse1/b;",
        "",
        "",
        "sourceName",
        "",
        "imageResource",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;I)V",
        "Ljava/lang/String;",
        "getSourceName",
        "()Ljava/lang/String;",
        "I",
        "getImageResource",
        "()I",
        "SPOTIFY",
        "WEB",
        "GOOGLE_PODCASTS",
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


# static fields
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lse1/b;

.field public static final enum GOOGLE_PODCASTS:Lse1/b;

.field public static final enum SPOTIFY:Lse1/b;

.field public static final enum WEB:Lse1/b;


# instance fields
.field private final imageResource:I

.field private final sourceName:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lse1/b;
    .locals 3

    sget-object v0, Lse1/b;->SPOTIFY:Lse1/b;

    sget-object v1, Lse1/b;->WEB:Lse1/b;

    sget-object v2, Lse1/b;->GOOGLE_PODCASTS:Lse1/b;

    filled-new-array {v0, v1, v2}, [Lse1/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lse1/b;

    const/4 v1, 0x0

    sget v2, Lie1/b;->d:I

    const-string v3, "SPOTIFY"

    invoke-direct {v0, v3, v1, v3, v2}, Lse1/b;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lse1/b;->SPOTIFY:Lse1/b;

    new-instance v0, Lse1/b;

    const-string v1, "Listen on the web"

    sget v2, Lie1/b;->b:I

    const-string v3, "WEB"

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1, v2}, Lse1/b;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lse1/b;->WEB:Lse1/b;

    new-instance v0, Lse1/b;

    const-string v1, "GOOGLE PODCASTS"

    sget v2, Lie1/b;->a:I

    const-string v3, "GOOGLE_PODCASTS"

    const/4 v4, 0x2

    invoke-direct {v0, v3, v4, v1, v2}, Lse1/b;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lse1/b;->GOOGLE_PODCASTS:Lse1/b;

    invoke-static {}, Lse1/b;->$values()[Lse1/b;

    move-result-object v0

    sput-object v0, Lse1/b;->$VALUES:[Lse1/b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lse1/b;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lse1/b;->sourceName:Ljava/lang/String;

    iput p4, p0, Lse1/b;->imageResource:I

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

    sget-object v0, Lse1/b;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lse1/b;
    .locals 1

    const-class v0, Lse1/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lse1/b;

    return-object p0
.end method

.method public static values()[Lse1/b;
    .locals 1

    sget-object v0, Lse1/b;->$VALUES:[Lse1/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lse1/b;

    return-object v0
.end method


# virtual methods
.method public final getImageResource()I
    .locals 1

    iget v0, p0, Lse1/b;->imageResource:I

    return v0
.end method

.method public final getSourceName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lse1/b;->sourceName:Ljava/lang/String;

    return-object v0
.end method
