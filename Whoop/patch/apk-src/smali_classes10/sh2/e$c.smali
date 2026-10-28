.class final enum Lsh2/e$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsh2/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsh2/e$c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lsh2/e$c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0082\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lsh2/e$c;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Lsh2/c$b;",
        "toFailureReason",
        "()Lsh2/c$b;",
        "START",
        "LOAD",
        "VERIFY",
        "PROCESS",
        "strap-auth_release"
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

.field private static final synthetic $VALUES:[Lsh2/e$c;

.field public static final enum LOAD:Lsh2/e$c;

.field public static final enum PROCESS:Lsh2/e$c;

.field public static final enum START:Lsh2/e$c;

.field public static final enum VERIFY:Lsh2/e$c;


# direct methods
.method private static final synthetic $values()[Lsh2/e$c;
    .locals 4

    sget-object v0, Lsh2/e$c;->START:Lsh2/e$c;

    sget-object v1, Lsh2/e$c;->LOAD:Lsh2/e$c;

    sget-object v2, Lsh2/e$c;->VERIFY:Lsh2/e$c;

    sget-object v3, Lsh2/e$c;->PROCESS:Lsh2/e$c;

    filled-new-array {v0, v1, v2, v3}, [Lsh2/e$c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lsh2/e$c;

    const-string v1, "START"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lsh2/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lsh2/e$c;->START:Lsh2/e$c;

    new-instance v0, Lsh2/e$c;

    const-string v1, "LOAD"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lsh2/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lsh2/e$c;->LOAD:Lsh2/e$c;

    new-instance v0, Lsh2/e$c;

    const-string v1, "VERIFY"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lsh2/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lsh2/e$c;->VERIFY:Lsh2/e$c;

    new-instance v0, Lsh2/e$c;

    const-string v1, "PROCESS"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lsh2/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lsh2/e$c;->PROCESS:Lsh2/e$c;

    invoke-static {}, Lsh2/e$c;->$values()[Lsh2/e$c;

    move-result-object v0

    sput-object v0, Lsh2/e$c;->$VALUES:[Lsh2/e$c;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lsh2/e$c;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

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

    sget-object v0, Lsh2/e$c;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lsh2/e$c;
    .locals 1

    const-class v0, Lsh2/e$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lsh2/e$c;

    return-object p0
.end method

.method public static values()[Lsh2/e$c;
    .locals 1

    sget-object v0, Lsh2/e$c;->$VALUES:[Lsh2/e$c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lsh2/e$c;

    return-object v0
.end method


# virtual methods
.method public final toFailureReason()Lsh2/c$b;
    .locals 2

    sget-object v0, Lsh2/e$c$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    sget-object v0, Lsh2/c$b;->PROCESS_FAILED:Lsh2/c$b;

    return-object v0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    sget-object v0, Lsh2/c$b;->VERIFY_FAILED:Lsh2/c$b;

    return-object v0

    :cond_2
    sget-object v0, Lsh2/c$b;->LOAD_FAILED:Lsh2/c$b;

    return-object v0

    :cond_3
    sget-object v0, Lsh2/c$b;->START_FAILED:Lsh2/c$b;

    return-object v0
.end method
