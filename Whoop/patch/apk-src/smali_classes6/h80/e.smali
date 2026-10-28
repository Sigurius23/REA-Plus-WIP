.class public final enum Lh80/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh80/e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lh80/e;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\r\u0008\u0086\u0081\u0002\u0018\u0000 \u000b2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000cB\u0019\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0007\u001a\u0004\u0008\n\u0010\tj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lh80/e;",
        "",
        "",
        "source",
        "label",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V",
        "Ljava/lang/String;",
        "getSource",
        "()Ljava/lang/String;",
        "getLabel",
        "Companion",
        "a",
        "AutoRetrieve",
        "Manual",
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
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lh80/e;

.field public static final enum AutoRetrieve:Lh80/e;

.field public static final Companion:Lh80/e$a;

.field public static final enum Manual:Lh80/e;


# instance fields
.field private final label:Ljava/lang/String;

.field private final source:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lh80/e;
    .locals 2

    sget-object v0, Lh80/e;->AutoRetrieve:Lh80/e;

    sget-object v1, Lh80/e;->Manual:Lh80/e;

    filled-new-array {v0, v1}, [Lh80/e;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lh80/e;

    const-string v1, "auto_retrieve"

    const-string v2, "credential_manager"

    const-string v3, "AutoRetrieve"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lh80/e;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lh80/e;->AutoRetrieve:Lh80/e;

    new-instance v0, Lh80/e;

    const-string v1, "user_submit"

    const-string v2, "manual"

    const-string v3, "Manual"

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1, v2}, Lh80/e;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lh80/e;->Manual:Lh80/e;

    invoke-static {}, Lh80/e;->$values()[Lh80/e;

    move-result-object v0

    sput-object v0, Lh80/e;->$VALUES:[Lh80/e;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lh80/e;->$ENTRIES:Lt83/a;

    new-instance v0, Lh80/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh80/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lh80/e;->Companion:Lh80/e$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lh80/e;->source:Ljava/lang/String;

    iput-object p4, p0, Lh80/e;->label:Ljava/lang/String;

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

    sget-object v0, Lh80/e;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lh80/e;
    .locals 1

    const-class v0, Lh80/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lh80/e;

    return-object p0
.end method

.method public static values()[Lh80/e;
    .locals 1

    sget-object v0, Lh80/e;->$VALUES:[Lh80/e;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lh80/e;

    return-object v0
.end method


# virtual methods
.method public final getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lh80/e;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getSource()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lh80/e;->source:Ljava/lang/String;

    return-object v0
.end method
