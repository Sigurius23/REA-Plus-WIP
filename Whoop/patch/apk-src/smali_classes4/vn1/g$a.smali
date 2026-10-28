.class public final Lvn1/g$a;
.super Lvn1/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvn1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lvn1/g$a;",
        "Lvn1/g;",
        "<init>",
        "()V",
        "",
        "c",
        "Z",
        "a",
        "()Z",
        "shouldShow",
        "home-notifications-center_release"
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
.field public static final b:Lvn1/g$a;

.field private static final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lvn1/g$a;

    invoke-direct {v0}, Lvn1/g$a;-><init>()V

    sput-object v0, Lvn1/g$a;->b:Lvn1/g$a;

    const/4 v0, 0x1

    sput-boolean v0, Lvn1/g$a;->c:Z

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lvn1/g;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    sget-boolean v0, Lvn1/g$a;->c:Z

    return v0
.end method
