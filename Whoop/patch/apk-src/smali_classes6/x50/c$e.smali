.class public final Lx50/c$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx50/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx50/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lx50/c$e;",
        "Lx50/c;",
        "<init>",
        "()V",
        "Lcom/whoop/metrics/common/ScreenState;",
        "c",
        "Lcom/whoop/metrics/common/ScreenState;",
        "getState",
        "()Lcom/whoop/metrics/common/ScreenState;",
        "state",
        "access_release"
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
.field public static final b:Lx50/c$e;

.field private static final c:Lcom/whoop/metrics/common/ScreenState;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx50/c$e;

    invoke-direct {v0}, Lx50/c$e;-><init>()V

    sput-object v0, Lx50/c$e;->b:Lx50/c$e;

    sget-object v0, Lcom/whoop/metrics/common/ScreenState;->LOADING:Lcom/whoop/metrics/common/ScreenState;

    sput-object v0, Lx50/c$e;->c:Lcom/whoop/metrics/common/ScreenState;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getState()Lcom/whoop/metrics/common/ScreenState;
    .locals 1

    sget-object v0, Lx50/c$e;->c:Lcom/whoop/metrics/common/ScreenState;

    return-object v0
.end method
