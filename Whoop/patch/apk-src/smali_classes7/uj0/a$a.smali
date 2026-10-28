.class final synthetic Luj0/a$a;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luj0/a;-><init>(Lik0/d;Loj0/a;Lqj0/e;Lbc3/c0;Ljava/time/Clock;Ltr2/n;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/i;",
        "Lc93/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final w:Luj0/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Luj0/a$a;

    invoke-direct {v0}, Luj0/a$a;-><init>()V

    sput-object v0, Luj0/a$a;->w:Luj0/a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const-string v4, "defaultDeviceDispatcher()Lkotlinx/coroutines/CoroutineDispatcher;"

    const/4 v5, 0x1

    const/4 v1, 0x0

    const-class v2, Lqj0/i;

    const-string v3, "defaultDeviceDispatcher"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a()Lbc3/z;
    .locals 1

    invoke-static {}, Lqj0/i;->b()Lbc3/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Luj0/a$a;->a()Lbc3/z;

    move-result-object v0

    return-object v0
.end method
