.class public final Lfy1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfy1/c;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\"\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0006\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lfy1/h;",
        "Lfy1/c;",
        "<init>",
        "()V",
        "Lec3/f2;",
        "Lfy1/b;",
        "b",
        "Lec3/f2;",
        "()Lec3/f2;",
        "currentScreen",
        "metrics-common_release"
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
.field public static final a:Lfy1/h;

.field private static final b:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field public static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lfy1/h;

    invoke-direct {v0}, Lfy1/h;-><init>()V

    sput-object v0, Lfy1/h;->a:Lfy1/h;

    const/4 v0, 0x0

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    sput-object v0, Lfy1/h;->b:Lec3/f2;

    const/16 v0, 0x8

    sput v0, Lfy1/h;->c:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    sget-object v0, Lfy1/h;->b:Lec3/f2;

    return-object v0
.end method
