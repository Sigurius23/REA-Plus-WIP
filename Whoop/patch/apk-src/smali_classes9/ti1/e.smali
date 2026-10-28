.class public final enum Lti1/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lti1/e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lti1/e;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0008\u0080\u0081\u0002\u0018\u0000 \u00132\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B!\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012j\u0002\u0008\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lti1/e;",
        "",
        "",
        "index",
        "",
        "identity",
        "Lcom/whoop/design/util/TextResource;",
        "label",
        "<init>",
        "(Ljava/lang/String;IILjava/lang/String;Lcom/whoop/design/util/TextResource;)V",
        "I",
        "getIndex",
        "()I",
        "Ljava/lang/String;",
        "getIdentity",
        "()Ljava/lang/String;",
        "Lcom/whoop/design/util/TextResource;",
        "getLabel",
        "()Lcom/whoop/design/util/TextResource;",
        "Companion",
        "a",
        "LastNight",
        "kennel_release"
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

.field private static final synthetic $VALUES:[Lti1/e;

.field public static final Companion:Lti1/e$a;

.field public static final enum LastNight:Lti1/e;


# instance fields
.field private final identity:Ljava/lang/String;

.field private final index:I

.field private final label:Lcom/whoop/design/util/TextResource;


# direct methods
.method private static final synthetic $values()[Lti1/e;
    .locals 1

    sget-object v0, Lti1/e;->LastNight:Lti1/e;

    filled-new-array {v0}, [Lti1/e;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lti1/e;

    sget v1, Lti1/d;->f:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v5

    const-string v1, "LastNight"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v4, "lastnight"

    invoke-direct/range {v0 .. v5}, Lti1/e;-><init>(Ljava/lang/String;IILjava/lang/String;Lcom/whoop/design/util/TextResource;)V

    sput-object v0, Lti1/e;->LastNight:Lti1/e;

    invoke-static {}, Lti1/e;->$values()[Lti1/e;

    move-result-object v0

    sput-object v0, Lti1/e;->$VALUES:[Lti1/e;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lti1/e;->$ENTRIES:Lt83/a;

    new-instance v0, Lti1/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lti1/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lti1/e;->Companion:Lti1/e$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/String;Lcom/whoop/design/util/TextResource;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Lcom/whoop/design/util/TextResource;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lti1/e;->index:I

    iput-object p4, p0, Lti1/e;->identity:Ljava/lang/String;

    iput-object p5, p0, Lti1/e;->label:Lcom/whoop/design/util/TextResource;

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

    sget-object v0, Lti1/e;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lti1/e;
    .locals 1

    const-class v0, Lti1/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lti1/e;

    return-object p0
.end method

.method public static values()[Lti1/e;
    .locals 1

    sget-object v0, Lti1/e;->$VALUES:[Lti1/e;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lti1/e;

    return-object v0
.end method


# virtual methods
.method public final getIdentity()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lti1/e;->identity:Ljava/lang/String;

    return-object v0
.end method

.method public final getIndex()I
    .locals 1

    iget v0, p0, Lti1/e;->index:I

    return v0
.end method

.method public final getLabel()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lti1/e;->label:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method
